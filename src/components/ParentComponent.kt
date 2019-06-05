package components

import com.curiouscreature.kotlin.math.Float3
import curiouscreature.kotlin.math.Quat
import ecs.Component
import ecs.Entity

data class ParentComponent(
    var localPosition: Float3 = Float3(0f, 0f, 0f),
    var localRotation: Quat = Quat(),
    var parent: Entity? = null
): Component() { constructor(entity: Entity) : this() }
