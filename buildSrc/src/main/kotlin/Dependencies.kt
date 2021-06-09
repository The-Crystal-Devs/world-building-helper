import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.dependencies

fun Project.kotlinProject() {
    dependencies {
        "implementation"("org.jetbrains.kotlin:kotlin-stdlib")
    }
}

fun Project.baseProject() {
    kotlinProject()

    dependencies {
        "testImplementation"("org.junit.jupiter:junit-jupiter-api:${Versions.junit}")
        "testImplementation"("org.junit.jupiter:junit-jupiter-params:${ Versions.junit }")
        "testImplementation"("io.strikt:strikt-core:${ Versions.strikt }")

        "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:${ Versions.junit }")
    }

    tasks.getByPath("test").doFirst {
        with(this as Test) {
            useJUnitPlatform()
        }
    }

}
