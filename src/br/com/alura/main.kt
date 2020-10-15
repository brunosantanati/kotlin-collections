package br.com.alura

fun main() {
    val banco = BancoDeNomes()
    banco.salva("Bruno")
    println(banco.nomes)
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