package components

import com.curiouscreature.kotlin.math.*
import components.PlayerCommandComponent
import curiouscreature.kotlin.math.Quat
import ecs.Signal
import ecs.System
import ecs.World
import engine.render.gl
import kotlin.browser.document

data class PlayerMovementSystem(val world: World) : System() {
  private val isLocked get() = document.asDynamic().pointerLockElement == gl.canvas

  // TODO: We should rename PlayerCommandComponent to CommandComponent and also add PlayerComponent because CommandComponent can also be a part of NPC for example
  private val enititesWithMovement get() = world.getAllEntitiesWith(
      PlayerCommandComponent::class,
      TransformComponent::class
  )

  override fun update(dt: Double) {
    enititesWithMovement.forEach {entity ->
      val playerCommandComponent = entity.getComponent<PlayerCommandComponent>()
      val transformComponent = entity.getComponent<TransformComponent>()
      transformComponent.rotation = Quat(playerCommandComponent.angle)
      // TODO: This should be external function and also optimized
      println("" + transformComponent.rotation.x + " " + transformComponent.rotation.y + " " + transformComponent.rotation.z + " " + transformComponent.rotation.w)
      val viewRotation = rotation(transformComponent.rotation)
      val viewTranslation = translation(transformComponent.position)
      val viewMatrix = inverse(viewTranslation * viewRotation)
      val forward = -normalize(Float3(viewMatrix.x.z, viewMatrix.y.z, viewMatrix.z.z))
      val right = -normalize(Float3(viewMatrix.x.x, viewMatrix.y.x, viewMatrix.z.x))

      val step = 0.1f
      if (playerCommandComponent.moveForward) {
        transformComponent.position += forward * step
      }
      if (playerCommandComponent.moveBackward) {
        transformComponent.position -= forward * step
      }
      if (playerCommandComponent.moveRight) {
        transformComponent.position -= right * step
      }
      if (playerCommandComponent.moveLeft) {
        transformComponent.position += right * step
      }
    }
  }
}
