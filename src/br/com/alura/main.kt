package br.com.alura

//Doc collections: https://kotlinlang.org/docs/reference/constructing-collections.html

fun main() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes //recebe uma cópia(vazia nesse momento) devido ao toList()
    banco.salva("Bruno")
    println(nomesSalvos) //imprime vazio pois a cópia está vazia
    println(BancoDeNomes().nomes) //devido ao uso do companion object essa lista não está vazia, mesmo usando nova instância
}

class BancoDeNomes{
    val nomes: Collection<String> get() = dados.toList() //devolvendo uma cópia(copia a lista mutável para uma lista imutável)

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        val dados = mutableListOf<String>() //Companion object na coleção mutável para manter os dados
    }
}