plugins {
    application
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
}

group = "ru.otus.first"
version = "1.0.0"

application {
    mainClassName = "${project.group}.FirstMainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

}
