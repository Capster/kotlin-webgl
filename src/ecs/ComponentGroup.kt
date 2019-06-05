package ecs

import kotlin.reflect.KClass

// TODO: This should be the part of an optimized ECS
data class ComponentGroup(val componentMap: MutableMap<KClass<out Component>, Component>) {
  inline fun <reified T : Component> get() {
    // return componentMap[T::class]
  }
}