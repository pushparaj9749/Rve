pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // VideoProcessor (Apache-2.0, reverse)
    }
}

rootProject.name = "AnkitMotionPlus"
include(":app")
include(":core-model")
include(":core-database")
include(":core-effect")
include(":core-export")
include(":core-ui")
include(":feature-home")
include(":feature-editor")
include(":feature-reverse")
