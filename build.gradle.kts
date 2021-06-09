import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version Versions.kotlin apply false
}

allprojects {
    group = "com.github.the-crystal-devs"
    version = "1.0-SNAPSHOT"

    repositories {
        jcenter()
    }
}

subprojects {
    tasks.withType<KotlinJvmCompile>().all {
        kotlinOptions.jvmTarget = "16"
    }
}