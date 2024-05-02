import org.gradle.api.JavaVersion

object AppConfig {
    const val COMPILE_SDK_VERSION = 34
    const val BUILD_TOOLS_VERSION = "34.0.0"
    const val MIN_SDK_VERSION = 24
    const val TARGET_SDK_VERSION = 34

    val SOURCE_COMPATIBILITY = JavaVersion.VERSION_1_8
    val TARGET_COMPATIBILITY = JavaVersion.VERSION_1_8
    const val JVM_TARGET = "1.8"

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
}
