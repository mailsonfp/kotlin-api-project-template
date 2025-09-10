plugins {
    kotlin("jvm")
}

group = "com.mailson.pereira.tech.assessment"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":input"))
    implementation(project(":output"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(Versions.javaVersion)
}