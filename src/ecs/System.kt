package ecs

abstract class System {
  abstract fun update(dt: Double)

  // abstract fun receive(signal: Signal) // ??
}

