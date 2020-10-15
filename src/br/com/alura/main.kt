package br.com.alura

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Alex") //não adiciona pois já existe
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana") //não adiciona pois já existe
    println(assistiramAmbos)
}