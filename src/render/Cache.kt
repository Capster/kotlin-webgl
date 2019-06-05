package render

import engine.render.UniformBuffer

class Cache {
  val uniformBuffers = mutableMapOf<String, UniformBuffer>()
}

val cache = Cache()