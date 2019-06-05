package engine.render

import org.khronos.webgl.*

// TODO: Should I change methods to operator fun get/set?
class ByteBuffer(size: Int) {
  val array: ArrayBuffer = ArrayBuffer(size)
  val view: DataView = DataView(array)
  val size: Int get() = array.byteLength

  private fun checkFreeSpace(pointer: Int, arraySize: Int) {
    if (arraySize * 4 + pointer > size) {
      throw Error("Not enough space for byte buffer at $pointer")
    }
  }

  fun getFloat(pointer: Int) = view.getFloat32(pointer)

  fun setFloat(pointer: Int, value: Float, littleEndian: Boolean = true) {
    view.setFloat32(pointer, value, littleEndian)
  }

  fun setFloat(pointer: Int, array: Array<Float>, littleEndian: Boolean = true) {
    checkFreeSpace(pointer, array.size)
    array.forEachIndexed { i, value -> view.setFloat32(pointer + i * 4, value, littleEndian) }
  }

  fun getInt(pointer: Int) = view.getInt32(pointer)

  fun setInt(pointer: Int, value: Int, littleEndian: Boolean = true) {
    view.setInt32(pointer, value, littleEndian)
  }

  fun setInt(pointer: Int, array: Array<Int>, littleEndian: Boolean = true) {
    checkFreeSpace(pointer, array.size)
    array.forEachIndexed { i, value -> view.setInt32(pointer + i * 4, value, littleEndian) }
  }
}
