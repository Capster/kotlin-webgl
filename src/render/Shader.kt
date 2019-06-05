package engine.render

import org.khronos.webgl.*
import org.khronos.webgl.WebGL2RenderingContext as GL

class Shader(vertexSource: String, fragmentSource: String) {
  val program: WebGLProgram = gl.createProgram() ?: throw Error("Cannot create program")

  init {
    val vertex: WebGLShader = compile(ShaderType.VERTEX, vertexSource)
    val fragment: WebGLShader = compile(ShaderType.FRAGMENT, fragmentSource)

    link(vertex, fragment)

    clear(vertex)
    clear(fragment)
  }

  private fun compile(type: ShaderType, source: String): WebGLShader {
    val shader: WebGLShader = when(type) {
      ShaderType.VERTEX -> gl.createShader(GL.VERTEX_SHADER)
      ShaderType.FRAGMENT -> gl.createShader(GL.FRAGMENT_SHADER)
    } ?: throw Error("Cannot create shader")

    gl.shaderSource(shader, source)
    gl.compileShader(shader)

    val success = gl.getShaderParameter(shader, GL.COMPILE_STATUS) as Boolean
    if (!success) {
      val error = gl.getShaderInfoLog(shader)
      throw Error("Cannot compile shader:\n$error")
    }

    return shader
  }

  private fun link(vertex: WebGLShader, fragment: WebGLShader) {
    gl.attachShader(program, vertex)
    gl.attachShader(program, fragment)
    gl.linkProgram(program)
  }

  private fun clear(shader: WebGLShader) {
    gl.detachShader(program, shader)
    gl.deleteShader(shader)
  }

  fun bind() = gl.useProgram(program)

  fun unbind() = gl.useProgram(null)

  fun bindUniformBlock(uniformName: String) {
    val index = gl.getUniformBlockIndex(program, uniformName)
      ?: throw Error("Uniform Block cannot be found in shader: $uniformName")

    // TODO: Uniform Buffer Object
  }

  private enum class ShaderType {
    VERTEX,
    FRAGMENT
  }
}
