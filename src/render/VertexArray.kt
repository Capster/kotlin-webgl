package engine.render

import com.curiouscreature.kotlin.math.Float3
import math.BoundingBox
import org.khronos.webgl.*
import render.DrawMode
import org.khronos.webgl.WebGL2RenderingContext as GL

enum class AttributeType(val location: Int, val size: Int) {
  POSITION(0, 3),
  NORMAL(1, 3),
  TANGENT(2, 3),
  UV(3, 2)
}

data class VertexAttribute(
    val type: AttributeType,
    val data: Array<Float>
)

class VertexArray(attributes: List<VertexAttribute>, indices: Array<Short>, drawMode: DrawMode = DrawMode.TRIANGLES) {
  private val vertexArrayObject: WebGLVertexArrayObject = gl.createVertexArray()
    ?: throw Error("Cannot create vertex array")

  private val indicesCount = indices.size

  private val drawMode = when(drawMode) {
    DrawMode.TRIANGLES -> GL.TRIANGLES
    DrawMode.LINES -> GL.LINES
  }

  init {
    bind()
    attributes.forEach { addAttribute(it) }
    addIndices(indices)
    clear()
  }

  private fun bind() = gl.bindVertexArray(vertexArrayObject)
  private fun unbind() = gl.bindVertexArray(null)

  private fun createBuffer(): WebGLBuffer = gl.createBuffer() ?: throw Error("Cannot create buffer")

  private fun addAttribute(attribute: VertexAttribute) {
    val (type, data) = attribute
    val buffer = createBuffer()
    gl.bindBuffer(GL.ARRAY_BUFFER, buffer)
    gl.bufferData(GL.ARRAY_BUFFER, Float32Array(data), GL.STATIC_DRAW)
    gl.vertexAttribPointer(type.location, type.size, GL.FLOAT, false, 0, 0)
    gl.enableVertexAttribArray(type.location)
  }

  private fun addIndices(indices: Array<Short>) {
    val buffer = createBuffer()
    gl.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, buffer)
    gl.bufferData(GL.ELEMENT_ARRAY_BUFFER, Int16Array(indices), GL.STATIC_DRAW)
  }

  fun render() {
    bind()
    gl.drawElements(drawMode, indicesCount, GL.UNSIGNED_SHORT, 0)
    unbind()
  }

  private fun clear() {
    gl.bindVertexArray(null)
    gl.bindBuffer(GL.ARRAY_BUFFER, null)
    gl.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, null)
  }
}
