plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.odoo"
    compileSdk = providers.gradleProperty("COMPILE_SDK_VERSION").get().toInt()

    defaultConfig {
        useLibrary("org.apache.http.legacy")
        manifestPlaceholders["applicationName"] = "Odoo"
        applicationId = "com.odoo"
        minSdk = providers.gradleProperty("MIN_SDK_VERSION").get().toInt()
        targetSdk = providers.gradleProperty("TARGET_SDK_VERSION").get().toInt()
        versionCode = providers.gradleProperty("VERSION_CODE").get().toInt()
        versionName  = providers.gradleProperty("VERSION_NAME").getOrNull().toString()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(fileTree("libs") { include("*.jar") })
    //
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.swiperefreshlayout)
    implementation(libs.volley)
    //
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //
    implementation(project(":intro-slider-lib"))
}
