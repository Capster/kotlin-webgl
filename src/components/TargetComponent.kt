package components

import ecs.Component
import ecs.Entity

data class TargetComponent(
    var posX: Int = 0,
    var posY: Int = 0,
    var width: Int = 0,
    var height: Int = 0
): Component() { constructor(entity: Entity) : this() }
