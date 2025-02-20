plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

gradlePlugin {
    // Fake plugin
    plugins.register("lec-config") {
        id = "lec-config"
        implementationClass = "pl.beavercoding.buildconfig.LECPlugin"
    }
}


dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)

    // For libs in code
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
