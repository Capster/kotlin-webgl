package systems

import com.curiouscreature.kotlin.math.Float3
import com.curiouscreature.kotlin.math.rotation
import com.curiouscreature.kotlin.math.transform
import com.curiouscreature.kotlin.math.translation
import components.ParentComponent
import components.TransformComponent
import ecs.Entity
import ecs.Signal
import ecs.System
import ecs.World

data class TransformSystem(val world: World) : System() {
  private val parentableEntities get() = world.getAllEntitiesWith(
      ParentComponent::class,
      TransformComponent::class
  )

  private fun calculateTransformation(
      transformComponent: TransformComponent,
      transformation: TransformComponent,
      parentComponent: ParentComponent
  ) {
    val transformMatrix = translation(transformation.position) * rotation(transformation.rotation)


    transformComponent.position = transformation.position + (
      transformMatrix.right * parentComponent.localPosition.x +
      transformMatrix.up * parentComponent.localPosition.y +
      transformMatrix.forward * parentComponent.localPosition.z
    )

    // transformComponent.position = transformation.position + transformMatrix * parentComponent.localPosition

    /*
    val localMatrix = translation(parentComponent.localPosition) * rotation(parentComponent.localRotation)
    transformComponent.position = (transformMatrix * localMatrix).translation
    transformComponent.rotation = (transformMatrix * localMatrix).rotation
     */

    transformComponent.rotation = transformation.rotation * parentComponent.localRotation
  }

  // TODO: Debug rotations
  // TODO: Should be lazy
  private fun localTransformation(entity: Entity): TransformComponent {
    val transformComponent = entity.getComponent<TransformComponent>()
    if (entity.hasComponent<ParentComponent>()) {
      val parentComponent = entity.getComponent<ParentComponent>()
      val transformation = localTransformation(parentComponent.parent!!)
      calculateTransformation(transformComponent, transformation, parentComponent)
    }
    return transformComponent
  }

  override fun update(dt: Double) {
    parentableEntities.forEach { localTransformation(it) }
  }
}
