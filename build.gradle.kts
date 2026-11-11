// Esse repositório oficialmente não suporta Gradle.
// Esse arquivo serve apenas para instruir LSPs a ler direito a estrutura.

plugins {
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

sourceSets {
    getByName("main") {
        java.setSrcDirs(listOf("listas"))
    }
}
