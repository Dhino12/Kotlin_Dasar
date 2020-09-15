package Belajar_Kotlin_36_Lambada_dengan_Receiver

import java.lang.StringBuilder

fun main() {
    // Domain Specific Languages (DSL).
        // DSL adalah sebuah bahasa komputer yang dikhususkan
        // untuk domain aplikasi tertentu.

    val message = buildString {
        append("Hello")
        append("From")
        append("Lambada")
    }
    println(message)
    // Pada kode di atas, StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action.
        //   Dengan begitu kita dapat memanggil parameter action
        //  tersebut dari variabel yang bertipekan StringBuilder.
}

fun buildString(action:StringBuilder.() -> Unit):String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return action.toString()
}