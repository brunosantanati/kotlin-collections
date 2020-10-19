package br.com.alura

//doc do infix notation: https://kotlinlang.org/docs/reference/functions.html#infix-notation

fun main() {
    //mapOf<Int, Double>(Pair(1, 20.0)) //podemos deixar explícito que é um map de Int e Double
    val pedidos: MutableMap<Int, Double?> = mutableMapOf(
            Pair(1, 20.0),
            Pair(2, 34.0),
            3 to 50.0,
            4 to null,
            6 to 100.0,
            7 to 100.0,
            8 to 80.0
    )

    val valorPedido: Double? = pedidos.get(5) //retorna null se a chave não existe
    println(valorPedido) //imprime null
    //val valorDoPedido: Double? = pedidos.getValue(5) //Lança exception se a chave não existe (java.util.NoSuchElementException: Key 5 is missing in the map.)

    println(pedidos.getOrElse(1, { //imprime 20
        "Não tem o pedido"
    }))
    println(pedidos.getOrElse(5, { //imprime "Não tem o pedido"
        "Não tem o pedido"
    }))

    println(pedidos.getOrDefault(1, -1.0)) //imprime 20
    println(pedidos.getOrDefault(5, -1.0)) //imprime -1.0

    println(pedidos.keys)

    for (numero in pedidos.keys){
        println("Pedido $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values){
        println("Valor do pedido $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        if(valor != null) numero % 2 == 0 && valor > 50.0 else false
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        if(valor != null) valor > 70.0 else false
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { valor ->
        valor % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + Pair(9, 90.0))
    println(pedidos + mapOf(10 to 90.0, 11 to 20.0))
    println(pedidos)

    println(pedidos - 6)
    println(pedidos)

    println(pedidos - listOf(6, 7))
    println(pedidos)

    pedidos.putAll(setOf<Pair<Int, Double>>(9 to 90.0, 10 to 20.0))
    pedidos += listOf<Pair<Int, Double>>(9 to 99.9, 11 to 110.0, 12 to 120.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 12
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double?>) {
    println(pedidos)

    val pedido0: Double? = pedidos[0]
    pedido0?.let {
        println("pedido 0 - $it")
    }

    val pedido1: Double? = pedidos[1]
    pedido1?.let {
        println("pedido 1 - $it")
    }

    for (pedido: Map.Entry<Int, Double?> in pedidos) {
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
