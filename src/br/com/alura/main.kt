package br.com.alura

fun main() {
    val banco = BancoDeNomes()
    banco.nomes.add("Bruno")
    println(banco.nomes)
}

class BancoDeNomes{
    val nomes = mutableListOf<String>()
}