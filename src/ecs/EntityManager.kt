package ecs

typealias EntityId = Int

class EntityManager {
  val entities = mutableListOf<Entity>()

  fun create(world: World): Entity {
    val entity = Entity(world, entities.size)
    entities.add(entity)
    return entity
  }

  fun remove(entity: Entity) = entities.remove(entity)

  fun has(entity: Entity) = entities.contains(entity)
}