package systems

import com.curiouscreature.kotlin.math.*
import components.CameraComponent
import components.TransformComponent
import org.khronos.webgl.WebGL2RenderingContext as GL
import components.RenderCacheComponent
import components.RenderComponent
import curiouscreature.kotlin.math.Quat
import ecs.System
import ecs.World
import engine.render.gl
import org.w3c.dom.HTMLCanvasElement

// TODO: Move all low-level webgl/opengl stuff to another class
fun resizeCanvas(canvas: HTMLCanvasElement) {
  val width = canvas.clientWidth
  val height = canvas.clientHeight

  if (canvas.width != width || canvas.height != height) {
    canvas.width = width
    canvas.height = height
  }
}

data class RenderSystem(val world: World) : System() {
  init {
    println("RenderSystem -> Init")
  }

  // private val renderComponents get() = world.getComponentsByType<RenderComponent>()
  private val renderCache get() = world.getComponentsByType<RenderCacheComponent>()[0]
  private val cameraEntities get() = world.getAllEntitiesWith(
      CameraComponent::class,
      TransformComponent::class
  )
  private val renderableEntities get() = world.getAllEntitiesWith(
      RenderComponent::class,
      TransformComponent::class
  )

  private fun preRender(dt: Double) {
    resizeCanvas(gl.canvas)
    gl.viewport(0, 0, gl.canvas.width, gl.canvas.height)
    gl.clear(GL.COLOR_BUFFER_BIT or GL.DEPTH_BUFFER_BIT)
    // gl.disable(GL.CULL_FACE)
    // gl.enable(GL.CULL_FACE)
    gl.enable(GL.DEPTH_TEST)
  }

  private fun calculateViewProjectionMatrix(): Mat4 {
    val activeCamera = cameraEntities[0] ?: return Mat4()
    val cameraComponent = activeCamera.getComponent<CameraComponent>()
    val (position, rotation) = activeCamera.getComponent<TransformComponent>()

    val aspectRatio: Float = gl.canvas.clientWidth.toFloat() / gl.canvas.clientHeight
    val viewRotation = rotation(rotation)
    val viewTranslation = translation(position)
    val viewMatrix = inverse(viewTranslation * viewRotation)

    val projectionMatrix = when(cameraComponent.type) {
      CameraComponent.CameraType.PERSPECTIVE -> perspective(
          radians(cameraComponent.fov),
          aspectRatio,
          cameraComponent.near,
          cameraComponent.far
      )
      CameraComponent.CameraType.ORTHOGONAL -> ortho(
          cameraComponent.left,
          cameraComponent.right,
          cameraComponent.bottom,
          cameraComponent.top,
          cameraComponent.near,
          cameraComponent.far
      )
    }
    return projectionMatrix * viewMatrix
  }

  // TODO: Looks shitty
  private fun calculateModelMatrix(
      position: Float3,
      rotation: Quat,
      scale: Float3
  ) = translation(position) * rotation(rotation) * scale(scale)

  private fun updateUniformBuffers(renderComponent: RenderComponent, transformComponent: TransformComponent) {
    val (_, color) = renderComponent
    val (position, rotation, scale) = transformComponent
    with(renderCache.uniformBuffers["Scene"]!!) {
      setUniform("viewProjectionMatrix", calculateViewProjectionMatrix())
      setUniform("modelMatrix", calculateModelMatrix(position, rotation, scale))
      setUniform("color", color)
      setUniform("lightPosition", Float3(1f, -1f, 1f))
      update()
    }
  }

  private fun render(dt: Double) {
    renderableEntities.forEach { renderable ->
      val renderComponent = renderable.getComponent<RenderComponent>()
      val transformComponent = renderable.getComponent<TransformComponent>()

      updateUniformBuffers(renderComponent, transformComponent)
      renderComponent.mesh.render(dt)
    }
  }

  override fun update(dt: Double) {
    preRender(dt)
    render(dt)
  }
}