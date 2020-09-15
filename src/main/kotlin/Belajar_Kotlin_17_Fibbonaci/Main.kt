package Belajar_Kotlin_17_Fibbonaci

import java.util.*

fun main() {


    var f_n: Int
    var f_n1: Int
    var f_n2: Int
    val n: Int
    // val inputUser = Scanner(System.`in`)

    print("Mengambil Nilai Fibonaci ke-: ")
    // n = inputUser.nextInt()
    n = readLine()?.toInt()!!

    f_n2 = 0
    f_n1 = 1
    f_n = 1
    for (i in 0 until n) {
        println("nilai ke- $i = $f_n")
        f_n = f_n1 + f_n2
        f_n2 = f_n1
        f_n1 = f_n
    }

}