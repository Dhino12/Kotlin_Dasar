package Belajar_Kotlin_03_Operator_Aritmatika

fun main(){
    var a = 20
    var b = 9f;
    var hasil:Float? = null

    hasil = a + b;
    println("$a + $b : $hasil")

    hasil = a - b;
    println("$a - $b : $hasil")

    hasil = a / b;
    println("$a / $b : ${hasil.toFloat()}")

    hasil = a * b;
    println("$a * $b : $hasil")
}