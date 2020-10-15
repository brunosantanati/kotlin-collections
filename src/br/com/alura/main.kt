package br.com.alura

//doc sobre Iterators: https://kotlinlang.org/docs/reference/iterators.html

fun main() {
    val nomes: List<String> = listOf(
    //val nomes: Collection<String> = listOf(
    //val nomes: Iterable<String> = listOf(
    //val nomes: Iterable<String> = setOf(
    "Alex",
            "Fran",
            "Gui",
            "Maria",
            "Ana"
    )

    //for(nome in nomes.iterator()){
    for(nome in nomes){
        println(nome)
    }

    println(nomes)

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}