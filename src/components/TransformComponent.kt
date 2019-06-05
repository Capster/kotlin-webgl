package components

import com.curiouscreature.kotlin.math.Float3
import curiouscreature.kotlin.math.Quat
import ecs.*

data class TransformComponent(
    var position: Float3 = Float3(0f, 0f, 0f),
    var rotation: Quat = Quat(),
    var scale: Float3 = Float3(0f, 0f, 0f)
): Component() { constructor(entity: Entity) : this() }
