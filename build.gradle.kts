plugins {
    java
    application
    id("com.github.johnrengelman.shadow") version "7.1.2"
    kotlin("jvm") version "2.0.0"
}

application.mainClass.set("io.github.name.bot.Main")    //TODO change here
group = "io.github.name"                                //TODO change here
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.0.0-beta.24")
    implementation("io.github.cdimascio:dotenv-java:3.0.0")
    implementation(kotlin("stdlib-jdk8"))
}

kotlin {
    jvmToolchain(21)
}