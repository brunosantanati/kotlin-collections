package br.com.alura

fun immutableColletions(){
    //val nomes: Collection<String> = listOf(
    //val nomes: Iterable<String> = listOf(
    //val nomes: Iterable<String> = setOf(
    val nomes: List<String> = listOf(
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