package engine.render

enum class UniformType(val size: Int, val alignment: Int) {
  INT(4, 4),
  FLOAT(4, 4),
  MAT2X4(32, 32),
  MAT3(48, 48),
  MAT4(64, 64),
  VEC2(8, 8),
  VEC3(12, 16),
  VEC4(16, 16)
}
