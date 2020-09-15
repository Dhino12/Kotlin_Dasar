package Belajar_Kotlin_12_When

import kotlin.random.Random

fun main() {
    // when di kotlin sama seperti switch case di java / bahasa lain
    print("Masukan Nilai A: ")
    val a = readLine()?.toInt()!!
    print("Masukan Nilai B: ")
    val b = readLine()?.toInt()!!

    print("Masukan Operator: ")
    var operator = readLine()
    var result = when(operator){
        "-" -> a - b
        "+" -> a + b
        "*" -> a * b
        "/" -> a / b
        "%" -> a % b
        else -> println("Operator tidak ditemukan")
    }

    println("Hasil = $result")

    println(" =========== Check Tipe Data ==========")
    val anyType:Any = 1000L
    when(anyType){
        is Int -> println("Tipe Data Integer")
        is Long -> println("Tipe Data Long")
        is Float -> println("Tipe Data Float")
        is String -> println("Tipe Data String")
        else -> println("Tipe Data TIdak Ditemukan")
    }

    println(" =========== Dengan Range ==========")
    val value = 20
    val range = 10..50
    when(value){
        in range -> println("value Didalam Range")
        !in range -> println("value Tidak Didalam Range")
        else -> println("Value undefined")
    }

    println(" =========== Dengan Memasukan ke Variable ==========")
    val registerNumber = when(val regis = getRegister()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
}

fun getRegister() = Random.nextInt(100)