include("mainproject", "subproject")

rootProject.name="analyzer-runtest"

pluginManagement {
    val codeartifactUri: String by settings
    val codeartifactToken: String by settings

    repositories {
        maven {
            url = uri(codeartifactUri)
            credentials {
                username = "aws"
                password = codeartifactToken
            }
        }
        mavenCentral()
    }
}