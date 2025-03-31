// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // HILT
    alias(libs.plugins.hilt) apply false
    // GOOGLE SERVICES
    alias(libs.plugins.google.services) apply false
    // FIREBASE
    alias(libs.plugins.crashlytics) apply false
}