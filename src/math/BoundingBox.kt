package math

import com.curiouscreature.kotlin.math.Float3
import engine.render.AttributeType
import engine.render.VertexAttribute
import org.khronos.webgl.get

data class BoundingBox(var min: Float3, var max: Float3) {
  val center get() = (min + max) * 0.5f
  val size get() = max - min

  companion object {
    // TODO: Rename
    fun fromVertexData(data: Array<Float>): BoundingBox {
    //fun fromVertexData(attributes: List<VertexAttribute>) {
      //val (_, data) = attributes.find { attribute -> attribute.type == AttributeType.POSITION }
      //    ?: throw Error("Cannot get position attribute")
      val minA = Float3()
      val maxA = Float3()
      (0..data.size step 3).forEach { index ->
        val x = data[index]
        val y = data[index + 1]
        val z = data[index + 2]

        if (x > maxA.x) maxA.x = x
        if (y > maxA.y) maxA.y = y
        if (z > maxA.z) maxA.z = z

        if (x < minA.x) minA.x = x
        if (y < minA.y) minA.y = y
        if (z < minA.z) minA.z = z
      }
      return BoundingBox(minA, maxA)
    }
  }

  // TODO: AABBBox.inside
  fun inside() {
    println("not implemented")
    return
  }
}