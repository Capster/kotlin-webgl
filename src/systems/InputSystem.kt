package systems

import com.curiouscreature.kotlin.math.Float3
import components.PlayerCommandComponent
import ecs.Signal
import ecs.System
import ecs.World
import engine.render.gl
import org.w3c.dom.events.EventListener
import org.w3c.dom.events.KeyboardEvent
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.events.WheelEvent
import kotlin.browser.document

// TODO: Move the whole event into an external class
// It should exist like a web(gl)-specific module that will match the input of the desktop version

data class InputSystem(val world: World) : System() {
  private val isLocked get() = document.asDynamic().pointerLockElement == gl.canvas

  private val keymap = mutableMapOf(
      Button.PRIMARY_FIRE to false,
      Button.SECONDARY_FIRE to false,
      Button.LEAN_LEFT to false,
      Button.LEAN_RIGHT to false,
      Button.MOVE_FORWARD to false,
      Button.MOVE_BACKWARD to false,
      Button.MOVE_LEFT to false,
      Button.MOVE_RIGHT to false,
      Button.CROUCH to false,
      Button.JUMP to false
  )

  var dx = 0f
  var dy = 0f

  private val mouseMoveEvent = EventListener event@ { event ->
    if (!isLocked) return@event
    val mouseEvent = event.asDynamic()
    dx = mouseEvent.movementX as Float
    dy = mouseEvent.movementY as Float
    val sens = 9f
    val rawSens = sens * 0.00572957f
    playerCommmandComponents.forEach { command ->
      command.angle += Float3(-dy * rawSens, -dx * rawSens, 0f)
    }
  }

  private val mouseWheelEvent = EventListener { event ->
    val mouseEvent = event as WheelEvent
    val delta = mouseEvent.deltaY
  }

  private fun setMouseButtonById(mouseButtonId: Int, state: Boolean) {
    when(mouseButtonId) {
      0 -> keymap[Button.PRIMARY_FIRE] = state
      2 -> keymap[Button.SECONDARY_FIRE] = state
    }
  }

  // TODO: parse buttons instead of a button field by using bitwise masks
  // https://developer.mozilla.org/ru/docs/Web/API/MouseEvent/buttons
  private val mouseDownEvent = EventListener { event ->
    val mouseEvent = event as MouseEvent
    gl.canvas.asDynamic().requestPointerLock()
    setMouseButtonById(mouseEvent.button.toInt(), true)
  }

  private val mouseUpEvent = EventListener { event ->
    val mouseEvent = event as MouseEvent
    setMouseButtonById(mouseEvent.button.toInt(), false)
  }

  private val keyDownEvent = EventListener { event ->
    val keyboardEvent = event as KeyboardEvent
    val button = getButtonByChar(keyboardEvent.key)
    keymap[button] = true
    keymap[Button.CROUCH] = keyboardEvent.ctrlKey
  }

  private val keyUpEvent = EventListener { event ->
    val keyboardEvent = event as KeyboardEvent
    val button = getButtonByChar(keyboardEvent.key)
    keymap[button] = false
    keymap[Button.CROUCH] = keyboardEvent.ctrlKey
  }

  init {
    gl.canvas.addEventListener("mousemove", mouseMoveEvent)
    gl.canvas.addEventListener("mousewheel", mouseWheelEvent)
    gl.canvas.addEventListener("mousedown", mouseDownEvent)
    gl.canvas.addEventListener("mouseup", mouseUpEvent)
    document.addEventListener("keydown", keyDownEvent)
    document.addEventListener("keyup", keyUpEvent)
    println("InputSystem -> Init")
  }

  fun isButtonDown(button: Button): Boolean = keymap[button]
      ?: throw Error("Unknown button type: $button")

  val playerCommmandComponents = world.getComponentsByType<PlayerCommandComponent>()

  override fun update(dt: Double) {
    playerCommmandComponents.forEach { command ->
      command.primaryFire = keymap[Button.PRIMARY_FIRE]!!
      command.secondaryFire = keymap[Button.SECONDARY_FIRE]!!
      // command.leanLeft = keymap[Button.LEAN_LEFT]!!
      // command.leanRight = keymap[Button.LEAN_RIGHT]!!
      command.moveForward = keymap[Button.MOVE_FORWARD]!!
      command.moveBackward = keymap[Button.MOVE_BACKWARD]!!
      command.moveLeft = keymap[Button.MOVE_LEFT]!!
      command.moveRight = keymap[Button.MOVE_RIGHT]!!
      command.crough = keymap[Button.CROUCH]!!
      command.secondaryFire = keymap[Button.JUMP]!!

      // command.mouseX = -dx
      // command.mouseY = -dy
    }
  }

  enum class Button {
    PRIMARY_FIRE,
    SECONDARY_FIRE,
    LEAN_LEFT,
    LEAN_RIGHT,
    MOVE_FORWARD,
    MOVE_BACKWARD,
    MOVE_LEFT,
    MOVE_RIGHT,
    CROUCH,
    JUMP
  }

  // TODO: KeyW instead of just w
  // https://hacks.mozilla.org/2017/03/internationalize-your-keyboard-controls/
  private fun getButtonByChar(char: String) = when(char) {
    "w" -> Button.MOVE_FORWARD
    "a" -> Button.MOVE_LEFT
    "s" -> Button.MOVE_BACKWARD
    "d" -> Button.MOVE_RIGHT
    "q" -> Button.LEAN_LEFT
    "e" -> Button.LEAN_RIGHT
    " " -> Button.JUMP
    "Control" -> Button.CROUCH
    else -> throw Error("Unknown button keycode: \"$char\"")
  }
}
