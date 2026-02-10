// Gradle Kotlin DSL build script for EcoCidade application
plugins {
    id("com.android.application") version "7.0.4" apply false
    id("kotlin-android") version "1.5.31" apply false
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.ecocidade"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.31")
    // Add other dependencies here
}