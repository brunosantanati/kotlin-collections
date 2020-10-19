package br.com.alura

fun main() {
    val pedidos = listOf(
            Pedido(1, 20.0),
            Pedido(2, 60.0),
            Pedido(3, 30.0),
            Pedido(4, 70.0)
    )
    println(pedidos)

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
        //Pair(pedido.numero, pedido)
        pedido.numero to pedido //infix
        //doc do infix notation: https://kotlinlang.org/docs/reference/functions.html#infix-notation
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosMapeados2: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados2)

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=1, valor=20.0)]) //buscar pela chave que é o Pedido
}

data class Pedido(val numero: Int, val valor: Double)
