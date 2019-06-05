package debug

import kotlin.browser.document

class UIDebugger(selector: String) {
  private val element = document.querySelector(selector)
    ?: throw Error("Cannot find element with given selector $selector")

  fun setText(text: String) {
    element.innerHTML = text
  }
}