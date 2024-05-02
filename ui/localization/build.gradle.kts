plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.allaber.localization"
    compileSdk = AppConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = AppConfig.MIN_SDK_VERSION
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
