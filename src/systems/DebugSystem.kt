package systems

import components.TargetComponent
import components.TransformComponent
import ecs.System
import ecs.World
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

data class DebugSystem(val world: World) : System() {
  private val debugEntities get() = world.getAllEntitiesWith(
      TransformComponent::class,
      TargetComponent::class
      //PlayerCommandComponent::class,
      //TransformComponent::class
  )

  var startTime = 0f

  override fun update(dt: Double) {
    startTime += dt.toFloat() * 5
    debugEntities.forEach { entity ->
      val targetComponent = entity.getComponent<TargetComponent>()
      val transformComponent = entity.getComponent<TransformComponent>()
      //println(dt)
      val ix = targetComponent.posX
      val iz = targetComponent.posY

      val width = targetComponent.width
      val height = targetComponent.height
      val freq = 1f
      // transformComponent.position.y = cos((1f * PI.toFloat() * 2f * dt.toFloat()) * (-2f) * 0.5f + 1f)
      transformComponent.position.y = (sin((ix + startTime) * 0.3f) * 2f) + (sin((iz + startTime) * 0.5f) * 2f) //  + sin(iz / height * PI.toFloat() * freq + startTime)
      // println(transformComponent.position.y)
      // math.cos( freq * math.pi * 2 * CurTime() + offset ) * ( max - min ) * 0.5 + min
      //println(transformComponent.position.y)
      // (Math.cos((ix / this.WIDTH * PI * 8 + this.theta)) + Math.sin((iz / this.HEIGHT * PI * 8 + this.theta)))
    }
  }
}
