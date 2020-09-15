package Belajar_Kotlin_37_Function_Type

typealias Arithmetic = ((Int,Int) -> Int)?

val sum:Arithmetic = {valueA,valueB -> valueA + valueB}
val multiplay:Arithmetic = {valueA,valueB -> valueA * valueB}

fun main() {
    val sumResult = sum?.invoke(19,10)
    val multiPlayResult = multiplay!!(20,10)

    println(sumResult)
    println(multiPlayResult)
}
// Setiap function type memiliki tanda kurung .
    // Di dalamnya terdapat sebuah parameter
    // dan jumlah tipe yang menandakan jumlah parameter dari fungsi tersebut.

// Ketika kita mempunyai beberapa fungsi yang memiliki function
// type yang sama, kita bisa menyederhanakannya. Bagaimana caranya?
// Manfaatkan kata kunci typealias untuk memberikan nama alternatif dari
// sebuah function type