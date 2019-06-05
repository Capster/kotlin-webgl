package components

import com.curiouscreature.kotlin.math.Float3
import ecs.Component
import ecs.Entity

class PlayerCommandComponent(entity: Entity) : Component() {
  var primaryFire = false
  var secondaryFire = false
  var moveForward = false
  var moveBackward = false
  var moveLeft = false
  var moveRight = false
  var crough = false
  var jump = false

  var angle = Float3()
}