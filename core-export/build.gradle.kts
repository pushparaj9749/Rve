plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.ankitmotion.core.export"
    compileSdk = 35
    defaultConfig { minSdk = 26 }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.media3.transformer)
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.effect)
    implementation(libs.kotlinx.coroutines.android)
    implementation(project(":core-model"))
}
