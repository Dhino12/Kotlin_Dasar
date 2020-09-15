package Belajar_Kotlin_OOP_69_Coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("Coroutines")
    }
    println("Hello")
    delay(2000L)
}
/*
* Kita menggunakan fungsi runBlocking 
* untuk memulai coroutine utama dan launch untuk menjalankan coroutine baru.
* */