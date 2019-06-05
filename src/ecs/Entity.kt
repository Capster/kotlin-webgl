package ecs

import kotlin.reflect.KClass

class Entity constructor(val world: World, val id: EntityId) {
  val components = mutableMapOf<KClass<out Component>, Component>()

  inline fun <reified T : Component> addComponent(
    newInstance: (Entity) -> T,
    noinline initFunc: T.() -> Unit = {}
  ) : Entity {
    val component = newInstance(this)
    component.initFunc()
    components[T::class] = component
    world.componentManager.add<T>(component)
    return this
  }

  inline fun <reified  T : Component> hasComponent(): Boolean {
    return components[T::class] != null
  }

  // TODO: It will try to cast nullable to a component type which is not good
  inline fun <reified T : Component> getComponent(): T {
    return components[T::class] as T ?: throw Error("Trying to get a component that is not attached to an entity")
  }

  inline fun <reified T : Component> getOrCreateComponent(newInstance: (Entity) -> Component) {
  }

  // TODO: It will not remove component from the global pool. It will only affect a local storage of an entity.
  inline fun <reified T : Component> removeComponent() {
    components.remove(T::class)
  }

  // TODO: This is only for current (not optimized) version of ECS
  fun hasComponents(vararg requiredComponents: KClass<out Component>): Boolean {
    return requiredComponents.all { component -> components[component] != null }
  }

  fun destroy() {
  }
}
