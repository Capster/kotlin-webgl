package engine.objects

import com.curiouscreature.kotlin.math.*
import engine.render.gl
import org.w3c.dom.events.EventListener
import org.w3c.dom.events.WheelEvent
import kotlin.browser.document
import kotlin.math.cos
import kotlin.math.sin

data class Camera(
  var position: Float3 = Float3(0f, 0f, 25f),
  var angle: Float3 = Float3(0f, 0f, 0f)
) {
  private val isLocked get() = document.asDynamic().pointerLockElement == gl.canvas

  private val fov: Float = 60f
  private val aspectRatio: Float = gl.canvas.clientWidth.toFloat() / gl.canvas.clientHeight
  // private val aspectRatio = 16f / 10f

  private val viewRotation get() = rotation(angle)
  private val viewTranslation get() = translation(position)
  private val viewMatrix get() = inverse(viewTranslation * viewRotation)
  private val projectionMatrix get() = perspective(radians(fov), aspectRatio, 0.01f, 10000f)
  val viewProjectionMatrix get() = projectionMatrix * viewMatrix

  // NOTE: Surprisingly Mat4 already has forward, right, etc.
  val forward get() = -normalize(Float3(viewMatrix.x.z, viewMatrix.y.z, viewMatrix.z.z))

  private val mouseMoveEvent = EventListener event@ { event ->
    if (!isLocked) return@event
    val mouseEvent = event.asDynamic()
    val dx = mouseEvent.movementX as Float
    val dy = mouseEvent.movementY as Float
    val sens = 9f
    val rawSens = sens * 0.00572957f
    angle += Float3(-dy * rawSens, -dx * rawSens, 0f)
  }

  private val mouseWheelEvent = EventListener { event ->
    val mouseEvent = event as WheelEvent
    val delta = mouseEvent.deltaY
    position += if (delta > 0) -forward else forward
    println(aspectRatio)
  }

  private val mouseClickEvent = EventListener {
    gl.canvas.asDynamic().requestPointerLock()
    Unit
  }

  init {
    gl.canvas.addEventListener("mousemove", mouseMoveEvent)
    gl.canvas.addEventListener("mousewheel", mouseWheelEvent)
    gl.canvas.addEventListener("click", mouseClickEvent)
  }
}
