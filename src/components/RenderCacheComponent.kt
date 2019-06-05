package components

import ecs.Component
import engine.objects.Camera
import engine.render.UniformBuffer

class RenderCacheComponent() : Component() {
  val uniformBuffers = mutableMapOf<String, UniformBuffer>()
  //val camera = Camera() // TODO: Camera should be a component e.g. CameraComponent
}
