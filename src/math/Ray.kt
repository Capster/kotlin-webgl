package math

import com.curiouscreature.kotlin.math.*
import kotlin.math.*

data class Ray(val origin: Float3 = Float3(), val direction: Float3) {
  private val dirfrac by lazy {
    Float3(1f / direction.x, 1f / direction.y, 1f / direction.z)
  }

  fun test(box: BoundingBox): Boolean {
    val t1 = (box.min.x - origin.x) * dirfrac.x
    val t2 = (box.max.x - origin.x) * dirfrac.x
    val t3 = (box.min.y - origin.y) * dirfrac.y
    val t4 = (box.max.y - origin.y) * dirfrac.y
    val t5 = (box.min.z - origin.z) * dirfrac.z
    val t6 = (box.max.z - origin.z) * dirfrac.z

    val tmin = max(max(min(t1, t2), min(t3, t4)), min(t5, t6))
    val tmax = min(min(max(t1, t2), max(t3, t4)), max(t5, t6))

    return when {
      tmax < 0 -> false
      tmin > tmax -> false
      else -> true
    }
  }

  fun test(sphere: Sphere): Boolean {
    val oc = origin - sphere.center
    val a = dot(direction, direction)
    val b = 2.0 * dot(oc, direction)
    val c = dot(oc, oc) - sphere.radius * sphere.radius
    val discriminant = b * b - 4f * a * c
    return discriminant > 0
  }
}
