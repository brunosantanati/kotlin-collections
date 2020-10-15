package br.com.alura

//Doc collections: https://kotlinlang.org/docs/reference/constructing-collections.html

fun main() {
    val banco = BancoDeNomes()
    val nomesSalvos: MutableCollection<String> = banco.nomes as MutableCollection<String> //Burlando a restrição para poder adicionar nessa lista
    nomesSalvos.add("Paulo") //add funciona devido a linha acima
    banco.salva("Bruno")
    println(nomesSalvos)
    println(BancoDeNomes().nomes) //devido ao uso do companion object essa lista não está vazia, mesmo usando nova instância
}

class BancoDeNomes{
    val nomes: Collection<String> get() = dados //Uma coleção mutável interna e uma imutável pública

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        val dados = mutableListOf<String>() //Companion object na coleção mutável para manter os dados
    }
}