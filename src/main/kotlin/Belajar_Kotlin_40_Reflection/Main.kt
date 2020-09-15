package Belajar_Kotlin_40_Reflection

// Dengan Kotlin, kita bisa memisahkan lambda expression menjadi fungsi tersendiri dan mereferensikannya
    // langsung sebagai instance dari function type
// Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances 
    // dari function type.
val sum: (Int , Int) -> Int = ::count
fun count(valueA:Int, valueB:Int): Int {
    return valueA + valueB
}

fun main() {
    val tambah = sum(12,21)
    println(tambah)
}