package Belajar_Kotlin_04_Casting_Konvert_TipeData

fun main(){
    var a = 7
    var b = 2.0
    var hasil:Any? = null

    hasil = a + b
    println("==== Int to Double ==== ")
    println("Double: " + hasil.toDouble())
    println(hasil)
    println("==== Int to Float ==== ")
    println("Float: " + hasil.toFloat())
    println("==== Int to Byte ==== ")
    println("Byte Max: " + Byte.MAX_VALUE)
    println("Byte: " + hasil.toByte())
    println("==== Int to Short ==== ")
    println("Short: " + hasil.toShort())
    println("==== Int to String ==== ")
    println("String: $hasil")
    println("==== Float to Int ==== ")
    println("Int: ${hasil.toFloat()}")
    println("==== Double to Float ==== ")
    println("Int: ${b.toFloat()}")
}