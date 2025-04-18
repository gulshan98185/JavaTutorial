plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.javatutorial"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.javatutorial"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.fastadapter)
    implementation("com.mikepenz:iconics-views:3.2.5")
    implementation("com.mikepenz:materialize:1.2.0@aar")
    implementation("com.mikepenz:community-material-typeface:2.7.94.1")
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}