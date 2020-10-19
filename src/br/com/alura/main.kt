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

    //não funciona muito bem pois a chave não pode se repetir no map:
    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
        pedido.valor > 50.0
    }
    println(mapa)

    //doc sobre collection grouping: https://kotlinlang.org/docs/reference/collection-grouping.html

    //ao invés de fazer do jeto acima, posso agrupar do jeito abaixo
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
            pedidos.groupBy { pedido: Pedido ->
                pedido.valor > 50.0
            }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])
    println(pedidosFreteGratisAgrupados[false])

    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosAgrupados.eachCount())

    val nomes = listOf(
            "Alex",
            "Fran",
            "Gui",
            "Ana",
            "Paulo",
            "Maria",
            "Mario",
            "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A'])

    val agenda2: Grouping<String, Char> = nomes.groupingBy { nome ->
        nome.first()
    }
    println(agenda2.eachCount()) //Além do eachCount(), também temos acesso a: fold(), reduce() e aggregate()
}

data class Pedido(val numero: Int, val valor: Double)
