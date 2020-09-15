package Belajar_Kotlin_27_Function_Rekursif

fun main() {
    println("Masukan Nilai Pertama: ")
    val n = readLine()?.toInt()!!
    val result = factorial(n)
    println("Hasil Faktorial: $result")
}

fun factorial(n:Int):Int{
    return if(n == 1) n
           else n * factorial(n - 1)
}