plugins {
    id("groovy")
    id("java-library")
    id("kotlin")
}

group = providers.gradleProperty("bcu.groupId").get()
version = providers.gradleProperty("bcu.plugin.version").get()

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(project("plugin-api"))
    compileOnly("com.android.tools.build:gradle-api:$ANDROID_GRADLE_VERSION")
}

mavenPublish()
