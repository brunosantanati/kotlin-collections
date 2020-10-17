package br.com.alura

//doc do infix notation: https://kotlinlang.org/docs/reference/functions.html#infix-notation

fun main() {
    //mapOf<Int, Double>(Pair(1, 20.0)) //podemos deixar explícito que é um map de Int e Double
    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)

    println(pedidos)

    val pedido0: Double? = pedidos[0]
    pedido0?.let {
        println("pedido 0 - $it")
    }

    val pedido1: Double? = pedidos[1]
    pedido1?.let {
        println("pedido 1 - $it")
    }

    for(pedido: Map.Entry<Int, Double> in pedidos){
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }
}