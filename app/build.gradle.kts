plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.allaber.rickandmorty"
    compileSdk = AppConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.allaber.rickandmorty"
        minSdk = AppConfig.MIN_SDK_VERSION
        targetSdk = AppConfig.TARGET_SDK_VERSION
        versionCode = AppConfig.VERSION_CODE
        versionName = AppConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProGuard.PROGUARD_ANDROID_OPTIMIZE),
                ProGuard.CONSUMER_RULES
            )
        }
    }
    compileOptions {
        sourceCompatibility = AppConfig.SOURCE_COMPATIBILITY
        targetCompatibility = AppConfig.TARGET_COMPATIBILITY
    }
    kotlinOptions {
        jvmTarget = AppConfig.JVM_TARGET
    }
}

dependencies {
    implementation(projects.ui.assets)
    implementation(projects.ui.localization)
    implementation(projects.ui.system)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
