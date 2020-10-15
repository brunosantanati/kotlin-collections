package br.com.alura

//doc sobre Iterators: https://kotlinlang.org/docs/reference/iterators.html

fun iteratorExample(){
    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }
}