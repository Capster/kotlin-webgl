package components

import ecs.*
import engine.math.Color

class ColorComponent(entity: Entity) : Component() {
  val baseColor = Color(255,  0, 255)
}