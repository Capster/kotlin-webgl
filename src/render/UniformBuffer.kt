package engine.render

import com.curiouscreature.kotlin.math.*
import org.khronos.webgl.*
import render.cache
import org.khronos.webgl.WebGL2RenderingContext as GL

data class UniformsData(
    val locations: MutableList<Int> = mutableListOf(),
    val blockSizes: MutableList<Int> = mutableListOf(),
    var offset: Int = 0,
    var chunkSize: Int = 16
)

data class Uniform(val name: String, val type: UniformType)

data class UniformBuffer(val id: Int, val name: String, val uniforms: List<Uniform>) {
  private val buffer: WebGLBuffer = gl.createBuffer()
      ?: throw Error("Cannot create WebGLBuffer")

  private val uniformNames: List<String> = uniforms.map { it.name }
  private val uniformsData: UniformsData = uniforms.foldIndexed(UniformsData(), ::addUniform)
  private val size: Int = uniformsData.offset
  private val locations: List<Int> = uniformsData.locations
  private val blockSizes: List<Int> = uniformsData.blockSizes
  private val byteBuffer: ByteBuffer = ByteBuffer(size)

  init {
    // TODO: Move cache to engine/scene/ecs
    cache.uniformBuffers[name] = this
    gl.bindBuffer(GL.UNIFORM_BUFFER, buffer)
    gl.bufferData(GL.UNIFORM_BUFFER, size, GL.DYNAMIC_DRAW)
    gl.bindBuffer(GL.UNIFORM_BUFFER, null)
    gl.bindBufferBase(GL.UNIFORM_BUFFER, id, buffer)
  }

  fun setUniform(uniformName: String, value: Any) {
    if (uniformName !in uniformNames) throw Error("Uniform $uniformName not found in $name")
    val location = locations[uniformNames.indexOf(uniformName)]
    // TODO: Better math library or at least interface with a toTypedArray method
    when(value) {
      is Float -> byteBuffer.setFloat(location, value)
      // is Array<*> -> byteBuffer.setFloat(location, value as Array<Float>)
      is KotlinMath -> byteBuffer.setFloat(location, value.toTypedArray())
      is Int -> byteBuffer.setInt(location, value)
      else -> throw Error("Unknown uniform type of $uniformName in $name")
    }
  }

  private fun addUniform(index: Int, acc: UniformsData, uniform: Uniform): UniformsData {
    val (_, type) = uniform
    if (acc.chunkSize >= type.alignment) {
      acc.chunkSize -= type.size
      // TODO: change index - 1 to something smoother
    } else if (acc.chunkSize > 0 && index != 0 && !(acc.chunkSize == 16 && type.size >= 16)) {
      acc.blockSizes[index - 1] += acc.chunkSize // TODO: Should be the same names
      acc.offset += acc.chunkSize
      acc.chunkSize = 16 - type.size
    }

    acc.locations.add(index, acc.offset)
    acc.blockSizes.add(index, type.size)
    acc.offset += type.size
    if (acc.chunkSize <= 0) acc.chunkSize = 16
    return acc
  }

  fun update() {
    gl.bindBuffer(GL.UNIFORM_BUFFER, buffer)
    gl.bufferSubData(GL.UNIFORM_BUFFER, 0, byteBuffer.view, 0, byteBuffer.size)
    gl.bindBuffer(GL.UNIFORM_BUFFER, null)
  }

  fun debug() = println(
    """
    Buffer Name: $name[$id]
    Uniform Locations: ${locations.joinToString()}
    Uniform Block Sizes: ${blockSizes.joinToString()}
    Buffer Size: $size
    """.trimIndent()
  )

  fun bind(shader: Shader, pointer: Int) = gl.uniformBlockBinding(shader.program, pointer, id)
}
