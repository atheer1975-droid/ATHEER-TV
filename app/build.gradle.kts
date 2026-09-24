hereplugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.google.ai.studio.qfilm" // أو اسم حزمة تطبيقك
    compileSdk = 34

    defaultConfig {
        applicationId = "com.google.ai.studio.qfilm"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
