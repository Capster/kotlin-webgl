package engine.render

import kotlin.browser.*
import org.w3c.dom.*
import org.khronos.webgl.*

fun getGLContext(element: String) : WebGL2RenderingContext {
  val canvas: HTMLCanvasElement = document.getElementById(element) as HTMLCanvasElement
  val context = canvas.getContext("webgl2") ?: throw Throwable("Cannot get a webgl2 context")
  return context as WebGL2RenderingContext
}

val gl: WebGL2RenderingContext = getGLContext("c")