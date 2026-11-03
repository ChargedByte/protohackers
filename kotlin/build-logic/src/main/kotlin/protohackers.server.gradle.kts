plugins {
    org.jetbrains.kotlin.jvm
    io.ktor.plugin
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(25)
}

val libs = versionCatalogs.named("libs")

dependencies {
    implementation("io.ktor:ktor-network")
    implementation(libs.findLibrary("logback.classic").get())
}
