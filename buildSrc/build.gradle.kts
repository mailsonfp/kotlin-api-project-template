plugins {
    kotlin("jvm")  version "1.9.25"
}

group = "com.mailson.pereira.kotlin.project.template"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.test {
    useJUnitPlatform()
}