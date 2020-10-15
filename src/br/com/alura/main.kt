package br.com.alura

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: List<String> = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos: Set<String> = assistiramCursoAndroid.plus(assistiramCursoKotlin) //plus é a mesma coisa que usar o sinal de +. Pesquisar operator
    println(assistiramAmbos)
}