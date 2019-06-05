package engine.primitives

import org.khronos.webgl.*
import engine.render.*

fun createPlaneGeometry(width: Float = 1f, height: Float = 1f): VertexArray {
  val halfWidth: Float = width / 2f
  val halfHeight: Float = height / 2f

  val positions = arrayOf(
    -halfWidth, -halfHeight, 0f,
    halfWidth, -halfHeight, 0f,
    halfWidth, halfHeight, 0f,
    -halfWidth, halfHeight, 0f
  )

  val normals = arrayOf(
    0f, 0f, -1f,
    0f, 0f, -1f,
    0f, 0f, -1f,
    0f, 0f, -1f
  )

  val uvs = arrayOf(
    0f, 0f,
    1f, 0f,
    1f, 1f,
    0f, 1f
  )

  val indices = arrayOf<Short>(
    0, 1, 2,
    0, 2, 3
  )

  return VertexArray(
    listOf(
      VertexAttribute(AttributeType.POSITION, positions),
      VertexAttribute(AttributeType.NORMAL, normals),
      VertexAttribute(AttributeType.UV, uvs)
    ),
    indices
  )
}
