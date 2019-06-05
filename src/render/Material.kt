package render

import engine.render.Shader
import engine.shaders.*

// TODO: Use subshader instead of a shader
class Material {
  val shader = Shader(
      vertexSource = baseVertex,
      fragmentSource = baseFragment
  )

  companion object {
    fun fromGLTF() {
    }
  }

  fun bind() {
    cache.uniformBuffers["Scene"]!!.bind(shader, 0)
    shader.bind()
  }

  fun unbind() {
    shader.unbind()
  }
}