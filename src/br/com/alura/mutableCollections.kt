package br.com.alura

fun mutableCollections(){
    //val nomes: MutableCollection<String> = mutableListOf(
    //val nomes: MutableIterable<String> = mutableListOf(
    val nomes: MutableList<String> = mutableListOf(
            "Alex",
            "Fran",
            "Gui",
            "Maria",
            "Ana"
    )

    nomes.add("Paulo")
    nomes.remove("Alex")

    for(nome in nomes){
        println(nome)
    }

    println(nomes)

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}