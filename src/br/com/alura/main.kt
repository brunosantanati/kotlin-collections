package br.com.alura

fun main() {
    val banco = BancoDeNomes()
    //banco.nomes.add("Bruno")
    banco.salva("Bruno")
    println(banco.nomes)
}

class BancoDeNomes{
    val dados = mutableListOf<String>()
    val nomes: Collection<String> get() = dados

    fun salva(nome: String){
        dados.add(nome)
    }
}