package components

import com.curiouscreature.kotlin.math.Float3
import ecs.Component
import ecs.Entity

class CameraComponent(entity: Entity) : Component() {
  var type = CameraType.PERSPECTIVE

  var fov = 60f
  var near = 0.01f
  var far = 10000f

  var left = 0f
  var right = 0f
  var top = 0f
  var bottom = 0f

  enum class CameraType {
    PERSPECTIVE,
    ORTHOGONAL
  }
}