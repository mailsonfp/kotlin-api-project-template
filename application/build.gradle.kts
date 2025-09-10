plugins {
    kotlin("jvm")
    id("org.springframework.boot") version Versions.springBoot
}

group = "com.mailson.pereira.kotlin.project.template"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":input"))
    implementation(project(":output"))
    implementation(project(":repository"))
    implementation(project(":service"))
    implementation(project(":web"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(Versions.javaVersion)
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    archiveFileName.set("{project-name}-0.0.1-SNAPSHOT.jar")
    mainClass.set(Versions.projectMainClassName)
}