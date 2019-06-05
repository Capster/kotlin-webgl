package ecs

import kotlin.reflect.KClass

class World {
  val componentManager = ComponentManager()
  val entityFactory = EntityManager()
  val systemStorage = mutableListOf<System>()

  inline fun <reified C : Component> register(): World {
    componentManager.register<C>()
    return this
  }

  fun addSystem(initFunction: (World) -> System): World {
    val system = initFunction(this) // TODO: Or we should pass world in update?
    systemStorage.add(system)
    return this
  }

  inline fun <reified T : Component> addSingleComponent(newInstance: () -> T) : World {
    val component = newInstance()
    componentManager.add<T>(component)
    return this
  }

  fun createEntity() = entityFactory.create(this)

  val entities get() = entityFactory.entities

  inline fun <reified T : Component> getComponentsByType(): MutableList<T> = componentManager.getByType()

  fun getAllEntitiesWith(vararg requiredComponents: KClass<out Component>): List<Entity> = entities.filter {
      entity -> entity.hasComponents(*requiredComponents)
  }

  // DEPRECATED:
  // fun removeEntity(entity: Entity) = entityFactory.remove(entity)
  // fun hasEntity(entity: Entity) = entityFactory.has(entity)

  fun update(dt: Double) {
    systemStorage.forEach { it.update(dt) }
  }
}