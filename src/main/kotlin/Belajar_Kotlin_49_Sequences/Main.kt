package Belajar_Kotlin_49_Sequences

fun main() {
    /*
    * Jika eager evaluation mengevaluasi seluruh item yang ada pada collection, 
    * lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan.
    * */
    // val list = (1..1000000).toList()
    // list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }

    /*
    * Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library 
    * yaitu generateSequence().
    * */
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}