package components

import com.curiouscreature.kotlin.math.Float3
import com.curiouscreature.kotlin.math.Float4
import ecs.Component
import ecs.Entity
import primitives.createCubeMesh
import render.Mesh

data class RenderComponent(
    var mesh: Mesh = createCubeMesh(),
    var color: Float4 = Float4(1f, 1f, 1f)
): Component() { constructor(entity: Entity) : this() }