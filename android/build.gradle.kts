android {
    namespace = "com.example.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.app"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    ndkVersion = "27.0.12077973"  // ✅ This is the added line

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
