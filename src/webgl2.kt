@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package org.khronos.webgl

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

//public external fun HTMLCanvasElement.getContext(contextId: String /* "webgl2" */, contextAttributes: WebGLContextAttributes? = definedExternally /* null */): WebGL2RenderingContext? = definedExternally
//public external fun HTMLCanvasElement.getContext(contextId: String /* "experimental-webgl2" */, contextAttributes: WebGLContextAttributes? = definedExternally /* null */): WebGL2RenderingContext? = definedExternally
//public external var ImageBitmap.width: Int get() = definedExternally; set(value) = definedExternally
//public external var ImageBitmap.height: Int get() = definedExternally; set(value) = definedExternally
//public external fun ImageBitmap.close(): Unit = definedExternally
public external interface WebGL2RenderingContext : WebGLRenderingContext {
    var READ_BUFFER: Int
    var UNPACK_ROW_LENGTH: Int
    var UNPACK_SKIP_ROWS: Int
    var UNPACK_SKIP_PIXELS: Int
    var PACK_ROW_LENGTH: Int
    var PACK_SKIP_ROWS: Int
    var PACK_SKIP_PIXELS: Int
    var COLOR: Int
    var DEPTH: Int
    var STENCIL: Int
    var RED: Int
    var RGB8: Int
    var RGBA8: Int
    var RGB10_A2: Int
    var TEXTURE_BINDING_3D: Int
    var UNPACK_SKIP_IMAGES: Int
    var UNPACK_IMAGE_HEIGHT: Int
    var TEXTURE_3D: Int
    var TEXTURE_WRAP_R: Int
    var MAX_3D_TEXTURE_SIZE: Int
    var UNSIGNED_INT_2_10_10_10_REV: Int
    var MAX_ELEMENTS_VERTICES: Int
    var MAX_ELEMENTS_INDICES: Int
    var TEXTURE_MIN_LOD: Int
    var TEXTURE_MAX_LOD: Int
    var TEXTURE_BASE_LEVEL: Int
    var TEXTURE_MAX_LEVEL: Int
    var MIN: Int
    var MAX: Int
    var DEPTH_COMPONENT24: Int
    var MAX_TEXTURE_LOD_BIAS: Int
    var TEXTURE_COMPARE_MODE: Int
    var TEXTURE_COMPARE_FUNC: Int
    var CURRENT_QUERY: Int
    var QUERY_RESULT: Int
    var QUERY_RESULT_AVAILABLE: Int
    var STREAM_READ: Int
    var STREAM_COPY: Int
    var STATIC_READ: Int
    var STATIC_COPY: Int
    var DYNAMIC_READ: Int
    var DYNAMIC_COPY: Int
    var MAX_DRAW_BUFFERS: Int
    var DRAW_BUFFER0: Int
    var DRAW_BUFFER1: Int
    var DRAW_BUFFER2: Int
    var DRAW_BUFFER3: Int
    var DRAW_BUFFER4: Int
    var DRAW_BUFFER5: Int
    var DRAW_BUFFER6: Int
    var DRAW_BUFFER7: Int
    var DRAW_BUFFER8: Int
    var DRAW_BUFFER9: Int
    var DRAW_BUFFER10: Int
    var DRAW_BUFFER11: Int
    var DRAW_BUFFER12: Int
    var DRAW_BUFFER13: Int
    var DRAW_BUFFER14: Int
    var DRAW_BUFFER15: Int
    var MAX_FRAGMENT_UNIFORM_COMPONENTS: Int
    var MAX_VERTEX_UNIFORM_COMPONENTS: Int
    var SAMPLER_3D: Int
    var SAMPLER_2D_SHADOW: Int
    var FRAGMENT_SHADER_DERIVATIVE_HINT: Int
    var PIXEL_PACK_BUFFER: Int
    var PIXEL_UNPACK_BUFFER: Int
    var PIXEL_PACK_BUFFER_BINDING: Int
    var PIXEL_UNPACK_BUFFER_BINDING: Int
    var FLOAT_MAT2x3: Int
    var FLOAT_MAT2x4: Int
    var FLOAT_MAT3x2: Int
    var FLOAT_MAT3x4: Int
    var FLOAT_MAT4x2: Int
    var FLOAT_MAT4x3: Int
    var SRGB: Int
    var SRGB8: Int
    var SRGB8_ALPHA8: Int
    var COMPARE_REF_TO_TEXTURE: Int
    var RGBA32F: Int
    var RGB32F: Int
    var RGBA16F: Int
    var RGB16F: Int
    var VERTEX_ATTRIB_ARRAY_INTEGER: Int
    var MAX_ARRAY_TEXTURE_LAYERS: Int
    var MIN_PROGRAM_TEXEL_OFFSET: Int
    var MAX_PROGRAM_TEXEL_OFFSET: Int
    var MAX_VARYING_COMPONENTS: Int
    var TEXTURE_2D_ARRAY: Int
    var TEXTURE_BINDING_2D_ARRAY: Int
    var R11F_G11F_B10F: Int
    var UNSIGNED_INT_10F_11F_11F_REV: Int
    var RGB9_E5: Int
    var UNSIGNED_INT_5_9_9_9_REV: Int
    var TRANSFORM_FEEDBACK_BUFFER_MODE: Int
    var MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int
    var TRANSFORM_FEEDBACK_VARYINGS: Int
    var TRANSFORM_FEEDBACK_BUFFER_START: Int
    var TRANSFORM_FEEDBACK_BUFFER_SIZE: Int
    var TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int
    var RASTERIZER_DISCARD: Int
    var MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int
    var MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int
    var INTERLEAVED_ATTRIBS: Int
    var SEPARATE_ATTRIBS: Int
    var TRANSFORM_FEEDBACK_BUFFER: Int
    var TRANSFORM_FEEDBACK_BUFFER_BINDING: Int
    var RGBA32UI: Int
    var RGB32UI: Int
    var RGBA16UI: Int
    var RGB16UI: Int
    var RGBA8UI: Int
    var RGB8UI: Int
    var RGBA32I: Int
    var RGB32I: Int
    var RGBA16I: Int
    var RGB16I: Int
    var RGBA8I: Int
    var RGB8I: Int
    var RED_INTEGER: Int
    var RGB_INTEGER: Int
    var RGBA_INTEGER: Int
    var SAMPLER_2D_ARRAY: Int
    var SAMPLER_2D_ARRAY_SHADOW: Int
    var SAMPLER_CUBE_SHADOW: Int
    var UNSIGNED_INT_VEC2: Int
    var UNSIGNED_INT_VEC3: Int
    var UNSIGNED_INT_VEC4: Int
    var INT_SAMPLER_2D: Int
    var INT_SAMPLER_3D: Int
    var INT_SAMPLER_CUBE: Int
    var INT_SAMPLER_2D_ARRAY: Int
    var UNSIGNED_INT_SAMPLER_2D: Int
    var UNSIGNED_INT_SAMPLER_3D: Int
    var UNSIGNED_INT_SAMPLER_CUBE: Int
    var UNSIGNED_INT_SAMPLER_2D_ARRAY: Int
    var DEPTH_COMPONENT32F: Int
    var DEPTH32F_STENCIL8: Int
    var FLOAT_32_UNSIGNED_INT_24_8_REV: Int
    var FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int
    var FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int
    var FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int
    var FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int
    var FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int
    var FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int
    var FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int
    var FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int
    var FRAMEBUFFER_DEFAULT: Int
    var UNSIGNED_INT_24_8: Int
    var DEPTH24_STENCIL8: Int
    var UNSIGNED_NORMALIZED: Int
    var DRAW_FRAMEBUFFER_BINDING: Int
    var READ_FRAMEBUFFER: Int
    var DRAW_FRAMEBUFFER: Int
    var READ_FRAMEBUFFER_BINDING: Int
    var RENDERBUFFER_SAMPLES: Int
    var FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int
    var MAX_COLOR_ATTACHMENTS: Int
    var COLOR_ATTACHMENT1: Int
    var COLOR_ATTACHMENT2: Int
    var COLOR_ATTACHMENT3: Int
    var COLOR_ATTACHMENT4: Int
    var COLOR_ATTACHMENT5: Int
    var COLOR_ATTACHMENT6: Int
    var COLOR_ATTACHMENT7: Int
    var COLOR_ATTACHMENT8: Int
    var COLOR_ATTACHMENT9: Int
    var COLOR_ATTACHMENT10: Int
    var COLOR_ATTACHMENT11: Int
    var COLOR_ATTACHMENT12: Int
    var COLOR_ATTACHMENT13: Int
    var COLOR_ATTACHMENT14: Int
    var COLOR_ATTACHMENT15: Int
    var FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int
    var MAX_SAMPLES: Int
    var HALF_FLOAT: Int
    var RG: Int
    var RG_INTEGER: Int
    var R8: Int
    var RG8: Int
    var R16F: Int
    var R32F: Int
    var RG16F: Int
    var RG32F: Int
    var R8I: Int
    var R8UI: Int
    var R16I: Int
    var R16UI: Int
    var R32I: Int
    var R32UI: Int
    var RG8I: Int
    var RG8UI: Int
    var RG16I: Int
    var RG16UI: Int
    var RG32I: Int
    var RG32UI: Int
    var VERTEX_ARRAY_BINDING: Int
    var R8_SNORM: Int
    var RG8_SNORM: Int
    var RGB8_SNORM: Int
    var RGBA8_SNORM: Int
    var SIGNED_NORMALIZED: Int
    var COPY_READ_BUFFER: Int
    var COPY_WRITE_BUFFER: Int
    var COPY_READ_BUFFER_BINDING: Int
    var COPY_WRITE_BUFFER_BINDING: Int
    var UNIFORM_BUFFER: Int
    var UNIFORM_BUFFER_BINDING: Int
    var UNIFORM_BUFFER_START: Int
    var UNIFORM_BUFFER_SIZE: Int
    var MAX_VERTEX_UNIFORM_BLOCKS: Int
    var MAX_FRAGMENT_UNIFORM_BLOCKS: Int
    var MAX_COMBINED_UNIFORM_BLOCKS: Int
    var MAX_UNIFORM_BUFFER_BINDINGS: Int
    var MAX_UNIFORM_BLOCK_SIZE: Int
    var MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int
    var MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int
    var UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int
    var ACTIVE_UNIFORM_BLOCKS: Int
    var UNIFORM_TYPE: Int
    var UNIFORM_SIZE: Int
    var UNIFORM_BLOCK_INDEX: Int
    var UNIFORM_OFFSET: Int
    var UNIFORM_ARRAY_STRIDE: Int
    var UNIFORM_MATRIX_STRIDE: Int
    var UNIFORM_IS_ROW_MAJOR: Int
    var UNIFORM_BLOCK_BINDING: Int
    var UNIFORM_BLOCK_DATA_SIZE: Int
    var UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int
    var UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int
    var UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int
    var UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int
    var INVALID_INDEX: Int
    var MAX_VERTEX_OUTPUT_COMPONENTS: Int
    var MAX_FRAGMENT_INPUT_COMPONENTS: Int
    var MAX_SERVER_WAIT_TIMEOUT: Int
    var OBJECT_TYPE: Int
    var SYNC_CONDITION: Int
    var SYNC_STATUS: Int
    var SYNC_FLAGS: Int
    var SYNC_FENCE: Int
    var SYNC_GPU_COMMANDS_COMPLETE: Int
    var UNSIGNALED: Int
    var SIGNALED: Int
    var ALREADY_SIGNALED: Int
    var TIMEOUT_EXPIRED: Int
    var CONDITION_SATISFIED: Int
    var WAIT_FAILED: Int
    var SYNC_FLUSH_COMMANDS_BIT: Int
    var VERTEX_ATTRIB_ARRAY_DIVISOR: Int
    var ANY_SAMPLES_PASSED: Int
    var ANY_SAMPLES_PASSED_CONSERVATIVE: Int
    var SAMPLER_BINDING: Int
    var RGB10_A2UI: Int
    var INT_2_10_10_10_REV: Int
    var TRANSFORM_FEEDBACK: Int
    var TRANSFORM_FEEDBACK_PAUSED: Int
    var TRANSFORM_FEEDBACK_ACTIVE: Int
    var TRANSFORM_FEEDBACK_BINDING: Int
    var TEXTURE_IMMUTABLE_FORMAT: Int
    var MAX_ELEMENT_INDEX: Int
    var TEXTURE_IMMUTABLE_LEVELS: Int
    var TIMEOUT_IGNORED: Int
    var MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int
    // fun bufferData(target: Int, sizeOrData: dynamic /* Int | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Nothing? */, usage: Int)
    // fun bufferSubData(target: Int, dstByteOffset: Int, srcData: dynamic /* Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Nothing? */)
    fun bufferData(target: Int, data: ArrayBufferView, usage: Int)
    fun bufferSubData(target: Int, dstByteOffset: Int, srcData: ArrayBufferView)
    fun bufferData(target: Int, srcData: dynamic /* Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Nothing? */, usage: Int, srcOffset: Int, length: Int? = definedExternally /* null */)
    fun bufferSubData(target: Int, dstByteOffset: Int, srcData: ArrayBufferView, srcOffset: Int, length: Int? = definedExternally /* null */)
    fun copyBufferSubData(readTarget: Int, writeTarget: Int, readOffset: Int, writeOffset: Int, size: Int)
    fun getBufferSubData(target: Int, srcByteOffset: Int, dstBuffer: ArrayBufferView, dstOffset: Int? = definedExternally /* null */, length: Int? = definedExternally /* null */)
    fun blitFramebuffer(srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: Int, filter: Int)
    fun framebufferTextureLayer(target: Int, attachment: Int, texture: WebGLTexture?, level: Int, layer: Int)
    fun invalidateFramebuffer(target: Int, attachments: Array<Int>)
    fun invalidateSubFramebuffer(target: Int, attachments: Array<Int>, x: Int, y: Int, width: Int, height: Int)
    fun readBuffer(src: Int)
    fun getInternalformatParameter(target: Int, internalformat: Int, pname: Int): Any
    fun renderbufferStorageMultisample(target: Int, samples: Int, internalformat: Int, width: Int, height: Int)
    fun texStorage2D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int)
    fun texStorage3D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int, depth: Int)
    // fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: ImageData)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: ImageData)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: ImageBitmap)
    // fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: ImageData)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: ImageData)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: ImageBitmap)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pboOffset: Int)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, source: ImageData)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, source: ImageBitmap)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, srcData: ArrayBufferView, srcOffset: Int)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, pboOffset: Int)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: ImageData)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: ImageBitmap)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, srcData: ArrayBufferView?)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, srcData: ArrayBufferView, srcOffset: Int)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pboOffset: Int)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, source: ImageData)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, source: ImageBitmap)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, srcData: ArrayBufferView, srcOffset: Int)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, pboOffset: Int)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, source: ImageData)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, source: HTMLImageElement)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, source: HTMLCanvasElement)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, source: HTMLVideoElement)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, source: ImageBitmap)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, srcData: ArrayBufferView?, srcOffset: Int? = definedExternally /* null */)
    fun copyTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: Int, height: Int)
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, offset: Int)
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, srcData: dynamic /* Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | Nothing? */, srcOffset: Int? = definedExternally /* null */, srcLengthOverride: Int? = definedExternally /* null */)
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, srcData: ArrayBufferView, srcOffset: Int? = definedExternally /* null */, srcLengthOverride: Int? = definedExternally /* null */)
    fun compressedTexImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, imageSize: Int, offset: Int)
    fun compressedTexImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, srcData: ArrayBufferView, srcOffset: Int? = definedExternally /* null */, srcLengthOverride: Int? = definedExternally /* null */)
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, offset: Int)
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, srcData: dynamic /* Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | Nothing? */, srcOffset: Int? = definedExternally /* null */, srcLengthOverride: Int? = definedExternally /* null */)
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, srcData: ArrayBufferView?, srcOffset: Int? = definedExternally /* null */, srcLengthOverride: Int? = definedExternally /* null */)
    fun compressedTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, imageSize: Int, offset: Int)
    fun compressedTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, srcData: ArrayBufferView, srcOffset: Int? = definedExternally /* null */, srcLengthOverride: Int? = definedExternally /* null */)
    fun getFragDataLocation(program: WebGLProgram, name: String): Int
    fun uniform1ui(location: WebGLUniformLocation?, v0: Int)
    fun uniform2ui(location: WebGLUniformLocation?, v0: Int, v1: Int)
    fun uniform3ui(location: WebGLUniformLocation?, v0: Int, v1: Int, v2: Int)
    fun uniform4ui(location: WebGLUniformLocation?, v0: Int, v1: Int, v2: Int, v3: Int)
    fun uniform1fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform2fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform3fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform4fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform1iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform2iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform3iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform4iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform1uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform2uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform3uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniform4uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix3x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix4x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix2x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix4x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix2x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix3x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Int? = definedExternally /* null */, srcLength: Int? = definedExternally /* null */)
    fun vertexAttribI4i(index: Int, x: Int, y: Int, z: Int, w: Int)
    fun vertexAttribI4iv(index: Int, values: Int32Array)
    fun vertexAttribI4ui(index: Int, x: Int, y: Int, z: Int, w: Int)
    fun vertexAttribI4uiv(index: Int, values: Uint32Array)
    fun vertexAttribIPointer(index: Int, size: Int, type: Int, stride: Int, offset: Int)
    fun vertexAttribDivisor(index: Int, divisor: Int)
    fun drawArraysInstanced(mode: Int, first: Int, count: Int, instanceCount: Int)
    fun drawElementsInstanced(mode: Int, count: Int, type: Int, offset: Int, instanceCount: Int)
    fun drawRangeElements(mode: Int, start: Int, end: Int, count: Int, type: Int, offset: Int)
    // fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, dstData: dynamic /* Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | Nothing? */)
    // fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, dstData: ArrayBufferView?)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, offset: Int)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, dstData: ArrayBufferView, dstOffset: Int)
    fun drawBuffers(buffers: Array<Int>)
    fun clearBufferfv(buffer: Int, drawbuffer: Int, values: Float32Array, srcOffset: Int? = definedExternally /* null */)
    fun clearBufferiv(buffer: Int, drawbuffer: Int, values: Int32Array, srcOffset: Int? = definedExternally /* null */)
    fun clearBufferuiv(buffer: Int, drawbuffer: Int, values: Uint32Array, srcOffset: Int? = definedExternally /* null */)
    fun clearBufferfi(buffer: Int, drawbuffer: Int, depth: Int, stencil: Int)
    fun createQuery(): WebGLQuery?
    fun deleteQuery(query: WebGLQuery?)
    fun isQuery(query: WebGLQuery?): Boolean
    fun beginQuery(target: Int, query: WebGLQuery)
    fun endQuery(target: Int)
    fun getQuery(target: Int, pname: Int): WebGLQuery?
    fun getQueryParameter(query: WebGLQuery, pname: Int): Any
    fun createSampler(): WebGLSampler?
    fun deleteSampler(sampler: WebGLSampler?)
    fun isSampler(sampler: WebGLSampler?): Boolean
    fun bindSampler(unit: Int, sampler: WebGLSampler?)
    fun samplerParameteri(sampler: WebGLSampler, pname: Int, param: Int)
    fun samplerParameterf(sampler: WebGLSampler, pname: Int, param: Int)
    fun getSamplerParameter(sampler: WebGLSampler, pname: Int): Any
    fun fenceSync(condition: Int, flags: Int): WebGLSync?
    fun isSync(sync: WebGLSync?): Boolean
    fun deleteSync(sync: WebGLSync?)
    fun clientWaitSync(sync: WebGLSync, flags: Int, timeout: Int): Int
    fun waitSync(sync: WebGLSync, flags: Int, timeout: Int)
    fun getSyncParameter(sync: WebGLSync, pname: Int): Any
    fun createTransformFeedback(): WebGLTransformFeedback?
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?)
    fun isTransformFeedback(tf: WebGLTransformFeedback?): Boolean
    fun bindTransformFeedback(target: Int, tf: WebGLTransformFeedback?)
    fun beginTransformFeedback(primitiveMode: Int)
    fun endTransformFeedback()
    fun transformFeedbackVaryings(program: WebGLProgram, varyings: Array<String>, bufferMode: Int)
    fun getTransformFeedbackVarying(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun pauseTransformFeedback()
    fun resumeTransformFeedback()
    fun bindBufferBase(target: Int, index: Int, buffer: WebGLBuffer?)
    fun bindBufferRange(target: Int, index: Int, buffer: WebGLBuffer?, offset: Int, size: Int)
    fun getIndexedParameter(target: Int, index: Int): Any
    fun getUniformIndices(program: WebGLProgram, uniformNames: Array<String>): Array<Int>?
    fun getActiveUniforms(program: WebGLProgram, uniformIndices: Array<Int>, pname: Int): Any
    fun getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Int
    fun getActiveUniformBlockParameter(program: WebGLProgram, uniformBlockIndex: Int, pname: Int): Any
    fun getActiveUniformBlockName(program: WebGLProgram, uniformBlockIndex: Int): String?
    fun uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Int, uniformBlockBinding: Int)
    fun createVertexArray(): WebGLVertexArrayObject?
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?)
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): Boolean
    fun bindVertexArray(array: WebGLVertexArrayObject?)
    companion object {
        var prototype: WebGL2RenderingContext = definedExternally
        var ACTIVE_ATTRIBUTES: Int = definedExternally
        var ACTIVE_TEXTURE: Int = definedExternally
        var ACTIVE_UNIFORMS: Int = definedExternally
        var ALIASED_LINE_WIDTH_RANGE: Int = definedExternally
        var ALIASED_POINT_SIZE_RANGE: Int = definedExternally
        var ALPHA: Int = definedExternally
        var ALPHA_BITS: Int = definedExternally
        var ALWAYS: Int = definedExternally
        var ARRAY_BUFFER: Int = definedExternally
        var ARRAY_BUFFER_BINDING: Int = definedExternally
        var ATTACHED_SHADERS: Int = definedExternally
        var BACK: Int = definedExternally
        var BLEND: Int = definedExternally
        var BLEND_COLOR: Int = definedExternally
        var BLEND_DST_ALPHA: Int = definedExternally
        var BLEND_DST_RGB: Int = definedExternally
        var BLEND_EQUATION: Int = definedExternally
        var BLEND_EQUATION_ALPHA: Int = definedExternally
        var BLEND_EQUATION_RGB: Int = definedExternally
        var BLEND_SRC_ALPHA: Int = definedExternally
        var BLEND_SRC_RGB: Int = definedExternally
        var BLUE_BITS: Int = definedExternally
        var BOOL: Int = definedExternally
        var BOOL_VEC2: Int = definedExternally
        var BOOL_VEC3: Int = definedExternally
        var BOOL_VEC4: Int = definedExternally
        var BROWSER_DEFAULT_WEBGL: Int = definedExternally
        var BUFFER_SIZE: Int = definedExternally
        var BUFFER_USAGE: Int = definedExternally
        var BYTE: Int = definedExternally
        var CCW: Int = definedExternally
        var CLAMP_TO_EDGE: Int = definedExternally
        var COLOR_ATTACHMENT0: Int = definedExternally
        var COLOR_BUFFER_BIT: Int = definedExternally
        var COLOR_CLEAR_VALUE: Int = definedExternally
        var COLOR_WRITEMASK: Int = definedExternally
        var COMPILE_STATUS: Int = definedExternally
        var COMPRESSED_TEXTURE_FORMATS: Int = definedExternally
        var CONSTANT_ALPHA: Int = definedExternally
        var CONSTANT_COLOR: Int = definedExternally
        var CONTEXT_LOST_WEBGL: Int = definedExternally
        var CULL_FACE: Int = definedExternally
        var CULL_FACE_MODE: Int = definedExternally
        var CURRENT_PROGRAM: Int = definedExternally
        var CURRENT_VERTEX_ATTRIB: Int = definedExternally
        var CW: Int = definedExternally
        var DECR: Int = definedExternally
        var DECR_WRAP: Int = definedExternally
        var DELETE_STATUS: Int = definedExternally
        var DEPTH_ATTACHMENT: Int = definedExternally
        var DEPTH_BITS: Int = definedExternally
        var DEPTH_BUFFER_BIT: Int = definedExternally
        var DEPTH_CLEAR_VALUE: Int = definedExternally
        var DEPTH_COMPONENT: Int = definedExternally
        var DEPTH_COMPONENT16: Int = definedExternally
        var DEPTH_FUNC: Int = definedExternally
        var DEPTH_RANGE: Int = definedExternally
        var DEPTH_STENCIL: Int = definedExternally
        var DEPTH_STENCIL_ATTACHMENT: Int = definedExternally
        var DEPTH_TEST: Int = definedExternally
        var DEPTH_WRITEMASK: Int = definedExternally
        var DITHER: Int = definedExternally
        var DONT_CARE: Int = definedExternally
        var DST_ALPHA: Int = definedExternally
        var DST_COLOR: Int = definedExternally
        var DYNAMIC_DRAW: Int = definedExternally
        var ELEMENT_ARRAY_BUFFER: Int = definedExternally
        var ELEMENT_ARRAY_BUFFER_BINDING: Int = definedExternally
        var EQUAL: Int = definedExternally
        var FASTEST: Int = definedExternally
        var FLOAT: Int = definedExternally
        var FLOAT_MAT2: Int = definedExternally
        var FLOAT_MAT3: Int = definedExternally
        var FLOAT_MAT4: Int = definedExternally
        var FLOAT_VEC2: Int = definedExternally
        var FLOAT_VEC3: Int = definedExternally
        var FLOAT_VEC4: Int = definedExternally
        var FRAGMENT_SHADER: Int = definedExternally
        var FRAMEBUFFER: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int = definedExternally
        var FRAMEBUFFER_BINDING: Int = definedExternally
        var FRAMEBUFFER_COMPLETE: Int = definedExternally
        var FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = definedExternally
        var FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int = definedExternally
        var FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = definedExternally
        var FRAMEBUFFER_UNSUPPORTED: Int = definedExternally
        var FRONT: Int = definedExternally
        var FRONT_AND_BACK: Int = definedExternally
        var FRONT_FACE: Int = definedExternally
        var FUNC_ADD: Int = definedExternally
        var FUNC_REVERSE_SUBTRACT: Int = definedExternally
        var FUNC_SUBTRACT: Int = definedExternally
        var GENERATE_MIPMAP_HINT: Int = definedExternally
        var GEQUAL: Int = definedExternally
        var GREATER: Int = definedExternally
        var GREEN_BITS: Int = definedExternally
        var HIGH_FLOAT: Int = definedExternally
        var HIGH_INT: Int = definedExternally
        var IMPLEMENTATION_COLOR_READ_FORMAT: Int = definedExternally
        var IMPLEMENTATION_COLOR_READ_TYPE: Int = definedExternally
        var INCR: Int = definedExternally
        var INCR_WRAP: Int = definedExternally
        var INT: Int = definedExternally
        var INT_VEC2: Int = definedExternally
        var INT_VEC3: Int = definedExternally
        var INT_VEC4: Int = definedExternally
        var INVALID_ENUM: Int = definedExternally
        var INVALID_FRAMEBUFFER_OPERATION: Int = definedExternally
        var INVALID_OPERATION: Int = definedExternally
        var INVALID_VALUE: Int = definedExternally
        var INVERT: Int = definedExternally
        var KEEP: Int = definedExternally
        var LEQUAL: Int = definedExternally
        var LESS: Int = definedExternally
        var LINEAR: Int = definedExternally
        var LINEAR_MIPMAP_LINEAR: Int = definedExternally
        var LINEAR_MIPMAP_NEAREST: Int = definedExternally
        var LINES: Int = definedExternally
        var LINE_LOOP: Int = definedExternally
        var LINE_STRIP: Int = definedExternally
        var LINE_WIDTH: Int = definedExternally
        var LINK_STATUS: Int = definedExternally
        var LOW_FLOAT: Int = definedExternally
        var LOW_INT: Int = definedExternally
        var LUMINANCE: Int = definedExternally
        var LUMINANCE_ALPHA: Int = definedExternally
        var MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = definedExternally
        var MAX_CUBE_MAP_TEXTURE_SIZE: Int = definedExternally
        var MAX_FRAGMENT_UNIFORM_VECTORS: Int = definedExternally
        var MAX_RENDERBUFFER_SIZE: Int = definedExternally
        var MAX_TEXTURE_IMAGE_UNITS: Int = definedExternally
        var MAX_TEXTURE_SIZE: Int = definedExternally
        var MAX_VARYING_VECTORS: Int = definedExternally
        var MAX_VERTEX_ATTRIBS: Int = definedExternally
        var MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = definedExternally
        var MAX_VERTEX_UNIFORM_VECTORS: Int = definedExternally
        var MAX_VIEWPORT_DIMS: Int = definedExternally
        var MEDIUM_FLOAT: Int = definedExternally
        var MEDIUM_INT: Int = definedExternally
        var MIRRORED_REPEAT: Int = definedExternally
        var NEAREST: Int = definedExternally
        var NEAREST_MIPMAP_LINEAR: Int = definedExternally
        var NEAREST_MIPMAP_NEAREST: Int = definedExternally
        var NEVER: Int = definedExternally
        var NICEST: Int = definedExternally
        var NONE: Int = definedExternally
        var NOTEQUAL: Int = definedExternally
        var NO_ERROR: Int = definedExternally
        var ONE: Int = definedExternally
        var ONE_MINUS_CONSTANT_ALPHA: Int = definedExternally
        var ONE_MINUS_CONSTANT_COLOR: Int = definedExternally
        var ONE_MINUS_DST_ALPHA: Int = definedExternally
        var ONE_MINUS_DST_COLOR: Int = definedExternally
        var ONE_MINUS_SRC_ALPHA: Int = definedExternally
        var ONE_MINUS_SRC_COLOR: Int = definedExternally
        var OUT_OF_MEMORY: Int = definedExternally
        var PACK_ALIGNMENT: Int = definedExternally
        var POINTS: Int = definedExternally
        var POLYGON_OFFSET_FACTOR: Int = definedExternally
        var POLYGON_OFFSET_FILL: Int = definedExternally
        var POLYGON_OFFSET_UNITS: Int = definedExternally
        var RED_BITS: Int = definedExternally
        var RENDERBUFFER: Int = definedExternally
        var RENDERBUFFER_ALPHA_SIZE: Int = definedExternally
        var RENDERBUFFER_BINDING: Int = definedExternally
        var RENDERBUFFER_BLUE_SIZE: Int = definedExternally
        var RENDERBUFFER_DEPTH_SIZE: Int = definedExternally
        var RENDERBUFFER_GREEN_SIZE: Int = definedExternally
        var RENDERBUFFER_HEIGHT: Int = definedExternally
        var RENDERBUFFER_INTERNAL_FORMAT: Int = definedExternally
        var RENDERBUFFER_RED_SIZE: Int = definedExternally
        var RENDERBUFFER_STENCIL_SIZE: Int = definedExternally
        var RENDERBUFFER_WIDTH: Int = definedExternally
        var RENDERER: Int = definedExternally
        var REPEAT: Int = definedExternally
        var REPLACE: Int = definedExternally
        var RGB: Int = definedExternally
        var RGB565: Int = definedExternally
        var RGB5_A1: Int = definedExternally
        var RGBA: Int = definedExternally
        var RGBA4: Int = definedExternally
        var SAMPLER_2D: Int = definedExternally
        var SAMPLER_CUBE: Int = definedExternally
        var SAMPLES: Int = definedExternally
        var SAMPLE_ALPHA_TO_COVERAGE: Int = definedExternally
        var SAMPLE_BUFFERS: Int = definedExternally
        var SAMPLE_COVERAGE: Int = definedExternally
        var SAMPLE_COVERAGE_INVERT: Int = definedExternally
        var SAMPLE_COVERAGE_VALUE: Int = definedExternally
        var SCISSOR_BOX: Int = definedExternally
        var SCISSOR_TEST: Int = definedExternally
        var SHADER_TYPE: Int = definedExternally
        var SHADING_LANGUAGE_VERSION: Int = definedExternally
        var SHORT: Int = definedExternally
        var SRC_ALPHA: Int = definedExternally
        var SRC_ALPHA_SATURATE: Int = definedExternally
        var SRC_COLOR: Int = definedExternally
        var STATIC_DRAW: Int = definedExternally
        var STENCIL_ATTACHMENT: Int = definedExternally
        var STENCIL_BACK_FAIL: Int = definedExternally
        var STENCIL_BACK_FUNC: Int = definedExternally
        var STENCIL_BACK_PASS_DEPTH_FAIL: Int = definedExternally
        var STENCIL_BACK_PASS_DEPTH_PASS: Int = definedExternally
        var STENCIL_BACK_REF: Int = definedExternally
        var STENCIL_BACK_VALUE_MASK: Int = definedExternally
        var STENCIL_BACK_WRITEMASK: Int = definedExternally
        var STENCIL_BITS: Int = definedExternally
        var STENCIL_BUFFER_BIT: Int = definedExternally
        var STENCIL_CLEAR_VALUE: Int = definedExternally
        var STENCIL_FAIL: Int = definedExternally
        var STENCIL_FUNC: Int = definedExternally
        var STENCIL_INDEX: Int = definedExternally
        var STENCIL_INDEX8: Int = definedExternally
        var STENCIL_PASS_DEPTH_FAIL: Int = definedExternally
        var STENCIL_PASS_DEPTH_PASS: Int = definedExternally
        var STENCIL_REF: Int = definedExternally
        var STENCIL_TEST: Int = definedExternally
        var STENCIL_VALUE_MASK: Int = definedExternally
        var STENCIL_WRITEMASK: Int = definedExternally
        var STREAM_DRAW: Int = definedExternally
        var SUBPIXEL_BITS: Int = definedExternally
        var TEXTURE: Int = definedExternally
        var TEXTURE0: Int = definedExternally
        var TEXTURE1: Int = definedExternally
        var TEXTURE10: Int = definedExternally
        var TEXTURE11: Int = definedExternally
        var TEXTURE12: Int = definedExternally
        var TEXTURE13: Int = definedExternally
        var TEXTURE14: Int = definedExternally
        var TEXTURE15: Int = definedExternally
        var TEXTURE16: Int = definedExternally
        var TEXTURE17: Int = definedExternally
        var TEXTURE18: Int = definedExternally
        var TEXTURE19: Int = definedExternally
        var TEXTURE2: Int = definedExternally
        var TEXTURE20: Int = definedExternally
        var TEXTURE21: Int = definedExternally
        var TEXTURE22: Int = definedExternally
        var TEXTURE23: Int = definedExternally
        var TEXTURE24: Int = definedExternally
        var TEXTURE25: Int = definedExternally
        var TEXTURE26: Int = definedExternally
        var TEXTURE27: Int = definedExternally
        var TEXTURE28: Int = definedExternally
        var TEXTURE29: Int = definedExternally
        var TEXTURE3: Int = definedExternally
        var TEXTURE30: Int = definedExternally
        var TEXTURE31: Int = definedExternally
        var TEXTURE4: Int = definedExternally
        var TEXTURE5: Int = definedExternally
        var TEXTURE6: Int = definedExternally
        var TEXTURE7: Int = definedExternally
        var TEXTURE8: Int = definedExternally
        var TEXTURE9: Int = definedExternally
        var TEXTURE_2D: Int = definedExternally
        var TEXTURE_BINDING_2D: Int = definedExternally
        var TEXTURE_BINDING_CUBE_MAP: Int = definedExternally
        var TEXTURE_CUBE_MAP: Int = definedExternally
        var TEXTURE_CUBE_MAP_NEGATIVE_X: Int = definedExternally
        var TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = definedExternally
        var TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = definedExternally
        var TEXTURE_CUBE_MAP_POSITIVE_X: Int = definedExternally
        var TEXTURE_CUBE_MAP_POSITIVE_Y: Int = definedExternally
        var TEXTURE_CUBE_MAP_POSITIVE_Z: Int = definedExternally
        var TEXTURE_MAG_FILTER: Int = definedExternally
        var TEXTURE_MIN_FILTER: Int = definedExternally
        var TEXTURE_WRAP_S: Int = definedExternally
        var TEXTURE_WRAP_T: Int = definedExternally
        var TRIANGLES: Int = definedExternally
        var TRIANGLE_FAN: Int = definedExternally
        var TRIANGLE_STRIP: Int = definedExternally
        var UNPACK_ALIGNMENT: Int = definedExternally
        var UNPACK_COLORSPACE_CONVERSION_WEBGL: Int = definedExternally
        var UNPACK_FLIP_Y_WEBGL: Int = definedExternally
        var UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int = definedExternally
        var UNSIGNED_BYTE: Int = definedExternally
        var UNSIGNED_INT: Int = definedExternally
        var UNSIGNED_SHORT: Int = definedExternally
        var UNSIGNED_SHORT_4_4_4_4: Int = definedExternally
        var UNSIGNED_SHORT_5_5_5_1: Int = definedExternally
        var UNSIGNED_SHORT_5_6_5: Int = definedExternally
        var VALIDATE_STATUS: Int = definedExternally
        var VENDOR: Int = definedExternally
        var VERSION: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_ENABLED: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_POINTER: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_SIZE: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_STRIDE: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_TYPE: Int = definedExternally
        var VERTEX_SHADER: Int = definedExternally
        var VIEWPORT: Int = definedExternally
        var ZERO: Int = definedExternally
        var READ_BUFFER: Int = definedExternally
        var UNPACK_ROW_LENGTH: Int = definedExternally
        var UNPACK_SKIP_ROWS: Int = definedExternally
        var UNPACK_SKIP_PIXELS: Int = definedExternally
        var PACK_ROW_LENGTH: Int = definedExternally
        var PACK_SKIP_ROWS: Int = definedExternally
        var PACK_SKIP_PIXELS: Int = definedExternally
        var COLOR: Int = definedExternally
        var DEPTH: Int = definedExternally
        var STENCIL: Int = definedExternally
        var RED: Int = definedExternally
        var RGB8: Int = definedExternally
        var RGBA8: Int = definedExternally
        var RGB10_A2: Int = definedExternally
        var TEXTURE_BINDING_3D: Int = definedExternally
        var UNPACK_SKIP_IMAGES: Int = definedExternally
        var UNPACK_IMAGE_HEIGHT: Int = definedExternally
        var TEXTURE_3D: Int = definedExternally
        var TEXTURE_WRAP_R: Int = definedExternally
        var MAX_3D_TEXTURE_SIZE: Int = definedExternally
        var UNSIGNED_INT_2_10_10_10_REV: Int = definedExternally
        var MAX_ELEMENTS_VERTICES: Int = definedExternally
        var MAX_ELEMENTS_INDICES: Int = definedExternally
        var TEXTURE_MIN_LOD: Int = definedExternally
        var TEXTURE_MAX_LOD: Int = definedExternally
        var TEXTURE_BASE_LEVEL: Int = definedExternally
        var TEXTURE_MAX_LEVEL: Int = definedExternally
        var MIN: Int = definedExternally
        var MAX: Int = definedExternally
        var DEPTH_COMPONENT24: Int = definedExternally
        var MAX_TEXTURE_LOD_BIAS: Int = definedExternally
        var TEXTURE_COMPARE_MODE: Int = definedExternally
        var TEXTURE_COMPARE_FUNC: Int = definedExternally
        var CURRENT_QUERY: Int = definedExternally
        var QUERY_RESULT: Int = definedExternally
        var QUERY_RESULT_AVAILABLE: Int = definedExternally
        var STREAM_READ: Int = definedExternally
        var STREAM_COPY: Int = definedExternally
        var STATIC_READ: Int = definedExternally
        var STATIC_COPY: Int = definedExternally
        var DYNAMIC_READ: Int = definedExternally
        var DYNAMIC_COPY: Int = definedExternally
        var MAX_DRAW_BUFFERS: Int = definedExternally
        var DRAW_BUFFER0: Int = definedExternally
        var DRAW_BUFFER1: Int = definedExternally
        var DRAW_BUFFER2: Int = definedExternally
        var DRAW_BUFFER3: Int = definedExternally
        var DRAW_BUFFER4: Int = definedExternally
        var DRAW_BUFFER5: Int = definedExternally
        var DRAW_BUFFER6: Int = definedExternally
        var DRAW_BUFFER7: Int = definedExternally
        var DRAW_BUFFER8: Int = definedExternally
        var DRAW_BUFFER9: Int = definedExternally
        var DRAW_BUFFER10: Int = definedExternally
        var DRAW_BUFFER11: Int = definedExternally
        var DRAW_BUFFER12: Int = definedExternally
        var DRAW_BUFFER13: Int = definedExternally
        var DRAW_BUFFER14: Int = definedExternally
        var DRAW_BUFFER15: Int = definedExternally
        var MAX_FRAGMENT_UNIFORM_COMPONENTS: Int = definedExternally
        var MAX_VERTEX_UNIFORM_COMPONENTS: Int = definedExternally
        var SAMPLER_3D: Int = definedExternally
        var SAMPLER_2D_SHADOW: Int = definedExternally
        var FRAGMENT_SHADER_DERIVATIVE_HINT: Int = definedExternally
        var PIXEL_PACK_BUFFER: Int = definedExternally
        var PIXEL_UNPACK_BUFFER: Int = definedExternally
        var PIXEL_PACK_BUFFER_BINDING: Int = definedExternally
        var PIXEL_UNPACK_BUFFER_BINDING: Int = definedExternally
        var FLOAT_MAT2x3: Int = definedExternally
        var FLOAT_MAT2x4: Int = definedExternally
        var FLOAT_MAT3x2: Int = definedExternally
        var FLOAT_MAT3x4: Int = definedExternally
        var FLOAT_MAT4x2: Int = definedExternally
        var FLOAT_MAT4x3: Int = definedExternally
        var SRGB: Int = definedExternally
        var SRGB8: Int = definedExternally
        var SRGB8_ALPHA8: Int = definedExternally
        var COMPARE_REF_TO_TEXTURE: Int = definedExternally
        var RGBA32F: Int = definedExternally
        var RGB32F: Int = definedExternally
        var RGBA16F: Int = definedExternally
        var RGB16F: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_INTEGER: Int = definedExternally
        var MAX_ARRAY_TEXTURE_LAYERS: Int = definedExternally
        var MIN_PROGRAM_TEXEL_OFFSET: Int = definedExternally
        var MAX_PROGRAM_TEXEL_OFFSET: Int = definedExternally
        var MAX_VARYING_COMPONENTS: Int = definedExternally
        var TEXTURE_2D_ARRAY: Int = definedExternally
        var TEXTURE_BINDING_2D_ARRAY: Int = definedExternally
        var R11F_G11F_B10F: Int = definedExternally
        var UNSIGNED_INT_10F_11F_11F_REV: Int = definedExternally
        var RGB9_E5: Int = definedExternally
        var UNSIGNED_INT_5_9_9_9_REV: Int = definedExternally
        var TRANSFORM_FEEDBACK_BUFFER_MODE: Int = definedExternally
        var MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int = definedExternally
        var TRANSFORM_FEEDBACK_VARYINGS: Int = definedExternally
        var TRANSFORM_FEEDBACK_BUFFER_START: Int = definedExternally
        var TRANSFORM_FEEDBACK_BUFFER_SIZE: Int = definedExternally
        var TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int = definedExternally
        var RASTERIZER_DISCARD: Int = definedExternally
        var MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int = definedExternally
        var MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int = definedExternally
        var INTERLEAVED_ATTRIBS: Int = definedExternally
        var SEPARATE_ATTRIBS: Int = definedExternally
        var TRANSFORM_FEEDBACK_BUFFER: Int = definedExternally
        var TRANSFORM_FEEDBACK_BUFFER_BINDING: Int = definedExternally
        var RGBA32UI: Int = definedExternally
        var RGB32UI: Int = definedExternally
        var RGBA16UI: Int = definedExternally
        var RGB16UI: Int = definedExternally
        var RGBA8UI: Int = definedExternally
        var RGB8UI: Int = definedExternally
        var RGBA32I: Int = definedExternally
        var RGB32I: Int = definedExternally
        var RGBA16I: Int = definedExternally
        var RGB16I: Int = definedExternally
        var RGBA8I: Int = definedExternally
        var RGB8I: Int = definedExternally
        var RED_INTEGER: Int = definedExternally
        var RGB_INTEGER: Int = definedExternally
        var RGBA_INTEGER: Int = definedExternally
        var SAMPLER_2D_ARRAY: Int = definedExternally
        var SAMPLER_2D_ARRAY_SHADOW: Int = definedExternally
        var SAMPLER_CUBE_SHADOW: Int = definedExternally
        var UNSIGNED_INT_VEC2: Int = definedExternally
        var UNSIGNED_INT_VEC3: Int = definedExternally
        var UNSIGNED_INT_VEC4: Int = definedExternally
        var INT_SAMPLER_2D: Int = definedExternally
        var INT_SAMPLER_3D: Int = definedExternally
        var INT_SAMPLER_CUBE: Int = definedExternally
        var INT_SAMPLER_2D_ARRAY: Int = definedExternally
        var UNSIGNED_INT_SAMPLER_2D: Int = definedExternally
        var UNSIGNED_INT_SAMPLER_3D: Int = definedExternally
        var UNSIGNED_INT_SAMPLER_CUBE: Int = definedExternally
        var UNSIGNED_INT_SAMPLER_2D_ARRAY: Int = definedExternally
        var DEPTH_COMPONENT32F: Int = definedExternally
        var DEPTH32F_STENCIL8: Int = definedExternally
        var FLOAT_32_UNSIGNED_INT_24_8_REV: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int = definedExternally
        var FRAMEBUFFER_DEFAULT: Int = definedExternally
        var UNSIGNED_INT_24_8: Int = definedExternally
        var DEPTH24_STENCIL8: Int = definedExternally
        var UNSIGNED_NORMALIZED: Int = definedExternally
        var DRAW_FRAMEBUFFER_BINDING: Int = definedExternally
        var READ_FRAMEBUFFER: Int = definedExternally
        var DRAW_FRAMEBUFFER: Int = definedExternally
        var READ_FRAMEBUFFER_BINDING: Int = definedExternally
        var RENDERBUFFER_SAMPLES: Int = definedExternally
        var FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int = definedExternally
        var MAX_COLOR_ATTACHMENTS: Int = definedExternally
        var COLOR_ATTACHMENT1: Int = definedExternally
        var COLOR_ATTACHMENT2: Int = definedExternally
        var COLOR_ATTACHMENT3: Int = definedExternally
        var COLOR_ATTACHMENT4: Int = definedExternally
        var COLOR_ATTACHMENT5: Int = definedExternally
        var COLOR_ATTACHMENT6: Int = definedExternally
        var COLOR_ATTACHMENT7: Int = definedExternally
        var COLOR_ATTACHMENT8: Int = definedExternally
        var COLOR_ATTACHMENT9: Int = definedExternally
        var COLOR_ATTACHMENT10: Int = definedExternally
        var COLOR_ATTACHMENT11: Int = definedExternally
        var COLOR_ATTACHMENT12: Int = definedExternally
        var COLOR_ATTACHMENT13: Int = definedExternally
        var COLOR_ATTACHMENT14: Int = definedExternally
        var COLOR_ATTACHMENT15: Int = definedExternally
        var FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int = definedExternally
        var MAX_SAMPLES: Int = definedExternally
        var HALF_FLOAT: Int = definedExternally
        var RG: Int = definedExternally
        var RG_INTEGER: Int = definedExternally
        var R8: Int = definedExternally
        var RG8: Int = definedExternally
        var R16F: Int = definedExternally
        var R32F: Int = definedExternally
        var RG16F: Int = definedExternally
        var RG32F: Int = definedExternally
        var R8I: Int = definedExternally
        var R8UI: Int = definedExternally
        var R16I: Int = definedExternally
        var R16UI: Int = definedExternally
        var R32I: Int = definedExternally
        var R32UI: Int = definedExternally
        var RG8I: Int = definedExternally
        var RG8UI: Int = definedExternally
        var RG16I: Int = definedExternally
        var RG16UI: Int = definedExternally
        var RG32I: Int = definedExternally
        var RG32UI: Int = definedExternally
        var VERTEX_ARRAY_BINDING: Int = definedExternally
        var R8_SNORM: Int = definedExternally
        var RG8_SNORM: Int = definedExternally
        var RGB8_SNORM: Int = definedExternally
        var RGBA8_SNORM: Int = definedExternally
        var SIGNED_NORMALIZED: Int = definedExternally
        var COPY_READ_BUFFER: Int = definedExternally
        var COPY_WRITE_BUFFER: Int = definedExternally
        var COPY_READ_BUFFER_BINDING: Int = definedExternally
        var COPY_WRITE_BUFFER_BINDING: Int = definedExternally
        var UNIFORM_BUFFER: Int = definedExternally
        var UNIFORM_BUFFER_BINDING: Int = definedExternally
        var UNIFORM_BUFFER_START: Int = definedExternally
        var UNIFORM_BUFFER_SIZE: Int = definedExternally
        var MAX_VERTEX_UNIFORM_BLOCKS: Int = definedExternally
        var MAX_FRAGMENT_UNIFORM_BLOCKS: Int = definedExternally
        var MAX_COMBINED_UNIFORM_BLOCKS: Int = definedExternally
        var MAX_UNIFORM_BUFFER_BINDINGS: Int = definedExternally
        var MAX_UNIFORM_BLOCK_SIZE: Int = definedExternally
        var MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int = definedExternally
        var MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int = definedExternally
        var UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int = definedExternally
        var ACTIVE_UNIFORM_BLOCKS: Int = definedExternally
        var UNIFORM_TYPE: Int = definedExternally
        var UNIFORM_SIZE: Int = definedExternally
        var UNIFORM_BLOCK_INDEX: Int = definedExternally
        var UNIFORM_OFFSET: Int = definedExternally
        var UNIFORM_ARRAY_STRIDE: Int = definedExternally
        var UNIFORM_MATRIX_STRIDE: Int = definedExternally
        var UNIFORM_IS_ROW_MAJOR: Int = definedExternally
        var UNIFORM_BLOCK_BINDING: Int = definedExternally
        var UNIFORM_BLOCK_DATA_SIZE: Int = definedExternally
        var UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int = definedExternally
        var UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int = definedExternally
        var UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int = definedExternally
        var UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int = definedExternally
        var INVALID_INDEX: Int = definedExternally
        var MAX_VERTEX_OUTPUT_COMPONENTS: Int = definedExternally
        var MAX_FRAGMENT_INPUT_COMPONENTS: Int = definedExternally
        var MAX_SERVER_WAIT_TIMEOUT: Int = definedExternally
        var OBJECT_TYPE: Int = definedExternally
        var SYNC_CONDITION: Int = definedExternally
        var SYNC_STATUS: Int = definedExternally
        var SYNC_FLAGS: Int = definedExternally
        var SYNC_FENCE: Int = definedExternally
        var SYNC_GPU_COMMANDS_COMPLETE: Int = definedExternally
        var UNSIGNALED: Int = definedExternally
        var SIGNALED: Int = definedExternally
        var ALREADY_SIGNALED: Int = definedExternally
        var TIMEOUT_EXPIRED: Int = definedExternally
        var CONDITION_SATISFIED: Int = definedExternally
        var WAIT_FAILED: Int = definedExternally
        var SYNC_FLUSH_COMMANDS_BIT: Int = definedExternally
        var VERTEX_ATTRIB_ARRAY_DIVISOR: Int = definedExternally
        var ANY_SAMPLES_PASSED: Int = definedExternally
        var ANY_SAMPLES_PASSED_CONSERVATIVE: Int = definedExternally
        var SAMPLER_BINDING: Int = definedExternally
        var RGB10_A2UI: Int = definedExternally
        var INT_2_10_10_10_REV: Int = definedExternally
        var TRANSFORM_FEEDBACK: Int = definedExternally
        var TRANSFORM_FEEDBACK_PAUSED: Int = definedExternally
        var TRANSFORM_FEEDBACK_ACTIVE: Int = definedExternally
        var TRANSFORM_FEEDBACK_BINDING: Int = definedExternally
        var TEXTURE_IMMUTABLE_FORMAT: Int = definedExternally
        var MAX_ELEMENT_INDEX: Int = definedExternally
        var TEXTURE_IMMUTABLE_LEVELS: Int = definedExternally
        var TIMEOUT_IGNORED: Int = definedExternally
        var MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int = definedExternally
    }
}
public external interface WebGLQuery : WebGLObject {
    companion object {
        var prototype: WebGLQuery = definedExternally
    }
}
public external interface WebGLSampler : WebGLObject {
    companion object {
        var prototype: WebGLSampler = definedExternally
    }
}
public external interface WebGLSync : WebGLObject {
    companion object {
        var prototype: WebGLSync = definedExternally
    }
}
public external interface WebGLTransformFeedback : WebGLObject {
    companion object {
        var prototype: WebGLTransformFeedback = definedExternally
    }
}
public external interface WebGLVertexArrayObject : WebGLObject {
    companion object {
        var prototype: WebGLVertexArrayObject = definedExternally
    }
}
