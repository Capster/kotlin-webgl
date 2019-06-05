package example

import com.curiouscreature.kotlin.math.Float3
import com.curiouscreature.kotlin.math.Float4
import com.curiouscreature.kotlin.math.translation
import engine.render.*

import kotlin.browser.window

import components.*
import curiouscreature.kotlin.math.Quat
import ecs.World
import systems.DebugSystem
import systems.InputSystem
import systems.RenderSystem
import systems.TransformSystem

// fun timedSin = math.cos( freq * math.pi * 2 * CurTime() + offset ) * ( max - min ) * 0.5 + min
fun ecsTest() {
  val world = World()
    .register<TransformComponent>()
    .register<TargetComponent>()
    .register<ParentComponent>()
    .register<RenderCacheComponent>()
    .register<PlayerCommandComponent>()
    .register<CameraComponent>()
    .register<RenderComponent>()
    .addSingleComponent(::RenderCacheComponent)
    .addSystem(::DebugSystem)
    .addSystem(::InputSystem)
    //.addSystem(::CameraSystem)
    .addSystem(::TransformSystem)
    .addSystem(::PlayerMovementSystem)
    .addSystem(::RenderSystem)

  fun createTarget(x: Int, y: Int, w: Int, h: Int) = world.createEntity()
      .addComponent(::TargetComponent) {
        posX = x
        posY = y
        width = w
        height = h
      }
    .addComponent(::TransformComponent) {
      position = Float3(x.toFloat() * 2.5f, 0f, y.toFloat() * 2.5f)
      //rotation = Float3(45f, 45f, 0f)
      scale = Float3(1f, 1f, 1f)
    }
    .addComponent(::RenderComponent) {
      color = if (x > 5) Float4(0f, 0f, 1f, 1f) else Float4(1f, 1f, 0f, 1f)
    }

  val width = 10
  val height = 15
  (1..width).forEach {x ->
    (1..height).forEach {y ->
      createTarget(x, y, width, height)
    }
  }

  /*val entity2 = world.createEntity()
      .addComponent(::TargetComponent)
      .addComponent(::TransformComponent) {
        scale = Float3(1f, 1f, 1f)
      }
      .addComponent(::ParentComponent) {
        localPosition = Float3(0.5f, 0.5f, 3f)
        //localRotation = Float3(0.7f, 0.7f, 0.7f)
        parent = entity1
      }
      .addComponent(::RenderComponent) {
        color = Float4(1f, 0f, 0f, 1f)
      }
   */

  val player = world.createEntity()
      .addComponent(::TransformComponent)
      .addComponent(::RenderComponent)
      .addComponent(::PlayerCommandComponent)

  val camera = world.createEntity()
      .addComponent(::TransformComponent)
      .addComponent(::CameraComponent)
      .addComponent(::ParentComponent) {
        parent = player
      }

  val viewModel = world.createEntity()
      .addComponent(::TransformComponent) { scale = Float3(0.3f, 0.1f, 0.1f) }
      .addComponent(::RenderComponent) { color = Float4(0f, 0f, 0f, 1f) }
      .addComponent(::ParentComponent) {
        parent = player
        localPosition = Float3(0f, -0.3f, -1f)
        localRotation = Quat(45f, 45f, 45f)
      }

  var last = 0.0
  fun render(now: Double) {
    val nowInMSec = now * 0.001
    val dt = nowInMSec - last
    last = nowInMSec
    window.requestAnimationFrame(::render)
    world.update(dt)
  }
  window.requestAnimationFrame(::render)

  val sceneUniform = UniformBuffer(0, "Scene", listOf(
      Uniform("viewProjectionMatrix", UniformType.MAT4),
      Uniform("modelMatrix", UniformType.MAT4),
      Uniform("color", UniformType.VEC4),
      Uniform("lightPosition", UniformType.VEC3)
  ))
  world.componentManager.getByType<RenderCacheComponent>()[0].uniformBuffers["Scene"] = sceneUniform
}

fun main() {
  ecsTest()
  // val debug = UIDebugger(".debug")
  // val testBox = BoundingBox.fromVertexData(testMesh.positions)
  // val trace = Ray(camera.position, camera.forward)

  // document.querySelector(".crosshair")!!.classList.toggle("green", trace.test(testBox))
}

