plugins {
    kotlin("multiplatform") version "1.3.30"
    id("com.github.salomonbrys.gradle.kotlin.js.mpp-assemble-web")
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

kotlin {
    js() {
        compilations["main"].kotlinOptions.outputFile = "${projectDir}/build/js/webgl2-sandbox.js"
        // compilations["main"].kotlinOptions.moduleKind = "plain"
        assembleWeb { thisTarget() }
    }

    sourceSets {
        val jsMain by getting {
            kotlin.srcDir("src")
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

val copyRuntime by tasks.creating(Copy::class) {
  from("build/web/js") {
    include("*")
  }
  into("dist/lib")
}

val copyMain by tasks.creating(Copy::class) {
  from("build/js") {
    include("*.js*")
  }
  into("dist")
}

val assemble = tasks.getByName("assemble")

assemble.finalizedBy(copyRuntime)
assemble.finalizedBy(copyMain)
