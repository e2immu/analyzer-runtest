plugins {
    java
    id("org.e2immu.analyzer-plugin").version("0.8.1-SNAPSHOT")
}

group = "org.e2immu"

repositories {
    maven {
        url = uri(project.findProperty("codeartifactUri") as String)
        credentials {
            username = "aws"
            password = project.findProperty("codeartifactToken") as String
        }
    }
    mavenCentral()
}

dependencies {
    implementation(project(":subproject"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

e2immu {

}