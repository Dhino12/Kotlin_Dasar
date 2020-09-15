package Belajar_Kotlin_OOP_73_Coroutine_Dispatcher.`05_Thread_Pool`

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3,"myPool")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000L)
        println("Resume in ${Thread.currentThread().name}")
    }.start()
}

/*
* Pada kode di atas, kita telah menetapkan thread myPool sebanyak 3 thread.
* Runtime akan secara otomatis menentukan pada thread mana coroutine
* akan dijalankan dan dilanjutkan.
* */