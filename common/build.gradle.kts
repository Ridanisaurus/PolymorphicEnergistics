architectury {
    val platforms: List<String> by rootProject.extra
    common(platforms)
}

dependencies {
    modImplementation(libs.fabric.loader)
    modCompileOnly(libs.fabric.api)
    modCompileOnly(libs.ae2.fabric)
    modCompileOnly(libs.polymorph.fabric)
}
