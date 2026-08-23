plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.odoo.widgets.slider"
    compileSdk = providers.gradleProperty("COMPILE_SDK_VERSION").get().toInt()

    defaultConfig {
        minSdk = providers.gradleProperty("MIN_SDK_VERSION").get().toInt()
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(libs.fragment)
}
