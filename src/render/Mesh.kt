package render

import engine.render.AttributeType
import engine.render.VertexArray
import engine.render.VertexAttribute

data class Mesh(
    val positions: Array<Float>,
    val normals: Array<Float>,
    val uvs: Array<Float>,
    val indices: Array<Short>,
    val drawMode: DrawMode
) {

  private val vertexArray = VertexArray(
      listOf(
          VertexAttribute(AttributeType.POSITION, positions),
          VertexAttribute(AttributeType.NORMAL, normals),
          VertexAttribute(AttributeType.UV, uvs)
      ),
      indices,
      drawMode
  )

  private val material = Material()

  companion object {
    fun fromGLTF() {}
  }

  fun render(dt: Double) {
    material.bind()
    vertexArray.render()
    material.unbind()
  }
}