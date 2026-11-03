plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "protohackers"

includeBuild("kotlin/build-logic")

file("kotlin")
    .listFiles { it.isDirectory && it.name != "build-logic" }
    ?.forEach {
        include(":${it.name}")
        project(":${it.name}").projectDir = it
    }
