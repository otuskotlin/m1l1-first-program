rootProject.name = "first-program"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val shadowJarVersion: String by settings
        kotlin("jvm") version kotlinVersion apply false
        id("com.github.johnrengelman.shadow") version shadowJarVersion apply false
    }
}
