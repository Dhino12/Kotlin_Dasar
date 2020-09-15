package Belajar_Kotlin_OOP_59_Exception_Handling.`02_NumberFormatException`

import java.lang.ArithmeticException
import java.lang.NumberFormatException

/*
* NumberFormatException disebabkan karena terjadi kesalahan dalam format angka.
* */

fun main() {
    try {
        val someValue = "10.1"
        someValue.toInt()
    }catch (e: NumberFormatException){
        System.err.println("Kesalahan Format Angka / Tipe data tidak valid ")
    }
}