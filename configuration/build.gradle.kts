plugins {
    kotlin("jvm")
}

group = "com.mailson.pereira.kotlin.project.template"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(Versions.javaVersion)
}