# kotlin-webgl
An experimental WebGL wrapper project written in Kotlin that includes camera support and a basic ECS implementation.

It allows for easy creation and manipulation of 3D scenes using an API.
The camera can be positioned and rotated to view the scene from different angles, while the ECS implementation allows for easy management of entities and their components.

Here's a short code snippet that shows how to create a simple system that can manipulate entities with certain components over time
```kt
data class TestSystem(val world: World) : System() {
  private val testEntities get() = world.getAllEntitiesWith(
      TransformComponent::class,
      TargetComponent::class
  )

  override fun update(dt: Double, startTime: Double) {
    debugEntities.forEach { entity ->
      val targetComponent = entity.getComponent<TargetComponent>()
      val transformComponent = entity.getComponent<TransformComponent>()
      val (ix, iz) = targetComponent
      transformComponent.position.y = (sin((posX + startTime) * 0.3f) * 2f) + (sin((posY + startTime) * 0.5f) * 2f)
    }
  }
}
```

And here's a gif animation that shows what the output might look like

![ECS Example](https://github.com/Capster/kotlin-webgl/assets/2873843/5084c6b6-c63f-4e86-8629-e3ae613b4fc9)

This project is ideal for beginners who want to learn more about WebGL, Kotlin and 3D graphics programming in general.
