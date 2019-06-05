package ecs

import kotlin.reflect.KClass

class ComponentManager {
  val pool = mutableMapOf<KClass<out Component>, MutableList<out Component>>()

  init {
  }

  inline fun <reified T : Component> register() {
    pool[T::class] = mutableListOf<T>()
  }

  // TODO: It will throw a NullPointerException if the component is not registered yet
  @Suppress("UNCHECKED_CAST")
  inline fun <reified T : Component> getByType(): MutableList<T> = pool[T::class]!! as MutableList<T>

  inline fun <reified T : Component> add(component: Component) = getByType<T>().add(component as T)
}