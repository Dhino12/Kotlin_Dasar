package Belajar_Kotlin_OOP_66_Generic_Function

fun <T> List<T>.slice(indices: IntRange): List<T> {
    if (indices.isEmpty()) return listOf()
    return this.subList(indices.first, indices.last + 1).toList()
}


fun main() {
    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..10))
}