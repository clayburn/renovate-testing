plugins {
    id("com.gradle.develocity") version "3.19"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.0.2"
}

val isCI = System.getenv("GITHUB_ACTIONS") != null

develocity {
    server.set("https://ge.solutions-team.gradle.com")
    buildScan {
        uploadInBackground.set(!isCI)
        publishing.onlyIf { it.isAuthenticated }
        obfuscation {
            ipAddresses { addresses -> addresses.map { _ -> "0.0.0.0" } }
        }
    }
}

rootProject.name = "gradle-7-renovate-test"
