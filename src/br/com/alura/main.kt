package br.com.alura

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    /*val assistiramAmbos = mutableListOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)*/
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramAmbos.distinct())
    println(assistiramAmbos[0])
}