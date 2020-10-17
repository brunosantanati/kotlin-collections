package br.com.alura

//doc do infix notation: https://kotlinlang.org/docs/reference/functions.html#infix-notation

fun main() {
    //mapOf<Int, Double>(Pair(1, 20.0)) //podemos deixar explícito que é um map de Int e Double
    val pedidos: MutableMap<Int, Double?> = mutableMapOf(
            Pair(1, 20.0),
            Pair(2, 34.0),
            3 to 50.0
    )

    println(pedidos)

    val pedido0: Double? = pedidos[0]
    pedido0?.let {
        println("pedido 0 - $it")
    }

    val pedido1: Double? = pedidos[1]
    pedido1?.let {
        println("pedido 1 - $it")
    }

    for(pedido: Map.Entry<Int, Double?> in pedidos){
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

    pedidos[4] = 70.0 //insere item no map
    println(pedidos)
    pedidos.put(5, 80.0) //insere item no map
    println(pedidos)
    pedidos[1] = 100.0 //atualiza item do map
    println(pedidos)
    pedidos.put(1, 200.0) //atualiza item do map
    println(pedidos)

    //putIfAbsent: If the specified key is not already associated with a value (or is mapped to null)
    // associates it with the given value and returns null, else returns the current value.
    pedidos.putIfAbsent(1, 300.0) //não fez nada. A chave já está associada com 200.0
    println(pedidos)
    pedidos.putIfAbsent(6, 400.0) //inseriu já que a chave 6 não existia
    println(pedidos)
    pedidos.put(6, null) //atualiza chave 6 com null
    println(pedidos)
    pedidos.putIfAbsent(6, 600.0) //atualizou já que a chave 6 continha null
    println(pedidos)

    pedidos.remove(6) //remove item
    println(pedidos)
    pedidos.remove(2, 30.0) //não remove porque a chave 2 não contém o valor 30
    println(pedidos)
    pedidos.remove(2, 34.0) //remove porque a chave 2 contém o valor 34
    println(pedidos)
}
