private const val kotlinVersion = "1.3.61"
private const val androidGradleVersion = "3.6.3"

private const val appcompatVersion = "1.0.2"
private const val coreKtxVersion = "1.0.2"
private const val constraintLayoutVersion = "1.1.3"

private const val junitVersion = "4.12"
private const val runnerVersion = "1.2.0"
private const val espressoVersion = "3.2.0"

object Dependencies {
    object Android {
        const val minSdkVersion = 14
        const val targetSdkVersion = 28
        const val compileSdkVersion = 28
        const val applicationId = "com.algokelvin.catalog.movie.tv.apps"
        const val versionCode = 1
        const val versionName = "0.1.0"
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }
    object Kotlin {
        const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    }
    object SupportLibrary {
        const val appCompat = "androidx.appcompat:appcompat:$appcompatVersion"
        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    }
    object TestingLibrary {
        const val testJunit = "junit:junit:$junitVersion"
        const val androidTestRunner = "androidx.test:runner:$runnerVersion"
        const val androidTestEspresso = "androidx.test.espresso:espresso-core:$espressoVersion"
    }
}