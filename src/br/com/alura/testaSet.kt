package br.com.alura

fun testaSet() {
    //doc "Set Specific Operations": https://kotlinlang.org/docs/reference/set-operations.html

    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Alex") //não adiciona pois já existe
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana") //não adiciona pois já existe
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin)) //union(): devolve um novo Set com a soma dos elementos dos conjuntos
    println(assistiramCursoAndroid union assistiramCursoKotlin) //infix

    println(assistiramCursoKotlin - assistiramCursoAndroid)
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin) //subtract(): devolve um novo Set subtraindo os elementos contidos no segundo conjunto

    println(assistiramCursoKotlin intersect assistiramCursoAndroid) //intersect(): devolve um novo Set apenas com os elementos contidos em ambos os conjuntos

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex") //insere duplicidade na lista
    println(assistiramList)
    println(assistiramList.toSet()) //remove duplicidade
}