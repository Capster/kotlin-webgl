package engine.shaders

// TODO: Change the way of storing glsl source code

val baseVertex =  """#version 300 es
precision mediump float;

layout(location = 0) in vec4 position;
layout(location = 1) in vec3 normal;

out vec4 v_position;
out vec3 v_normal;

uniform Scene {
  mat4 viewProjectionMatrix;
  mat4 modelMatrix;
  vec4 color;
  vec3 lightPosition;
};

void main() {
  gl_Position = viewProjectionMatrix * modelMatrix * position;
  v_position = position;
  v_normal = normal;
}
""".trimIndent()

val baseFragment =  """#version 300 es
precision mediump float;

uniform Scene {
  mat4 viewProjectionMatrix;
  mat4 modelMatrix;
  vec4 color;
  vec3 lightPosition;
};

in vec4 v_position;
in vec3 v_normal;

out vec4 fragColor;

void main() {
/*
  vec3 light_vector = normalize(lightPosition - v_position.xyz);
  vec3 normal = normalize(v_normal);
  // vec3 normal = normalize(texture(iNormal, v_uv).rgb * 2.0 - 1.0);

  vec3 diffuse = color.rgb; // texture(iDiffuse, v_uv).rgb;
  vec3 result = vec3(max(0.0, dot(light_vector, normal))) * diffuse;

  vec3 reflection = 2.0 * dot(light_vector, normal) * normal - light_vector;
  vec3 campos = vec3(transpose(inverse(modelMatrix)) * vec4(0,0,0,1));
  vec3 view = normalize(campos + v_position.xyz);

  result += pow(max(0.0, dot(reflection, view)), 4.0); // + texture(iEmissive, v_uv).rgb;
*/
  fragColor = vec4(color.rgb, 1);
}
""".trimIndent()
