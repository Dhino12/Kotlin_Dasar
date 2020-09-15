package Belajar_Kotlin_38_Lambada_Receiver_this

import java.lang.StringBuilder

fun main() {
    //    Beberapa fungsi yang menggunakan lambda receiver adalah 
    //    run, with, dan apply.
    //    Ketika ingin mengakses konteks dari sebuah objek,
    //    kita bisa saja tidak menuliskan atau menghilangkan kata kunci this.
    val buildString = StringBuilder().apply {
        append("Hello")
        append("Kotlin")
    }
    println(buildString)
}