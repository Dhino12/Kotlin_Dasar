package Belajar_Kotlin_OOP_73_Coroutine_Dispatcher.`04_Single_Thread_Context`

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking <Unit>{
    val dispatcher = newSingleThreadContext("MyThread")
    launch(dispatcher) {

        println("Starting in ${Thread.currentThread().name}")
        delay(1000L)
        println("Resume in ${Thread.currentThread().name}")
    }.start()
}