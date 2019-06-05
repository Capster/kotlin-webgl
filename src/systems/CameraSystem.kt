package systems

import com.curiouscreature.kotlin.math.*
import components.CameraComponent
import ecs.Signal
import ecs.System
import ecs.World
import engine.render.gl

data class CameraSystem(val world: World) : System() {
  private val cameraComponents get() = world.getComponentsByType<CameraComponent>()

  init {
    println("CameraSystem -> Init")
  }

  private fun updateCamera(camera: CameraComponent) {
    val aspectRatio: Float = gl.canvas.clientWidth.toFloat() / gl.canvas.clientHeight
  }

  override fun update(dt: Double) {
    cameraComponents.forEach(::updateCamera)
  }
}
