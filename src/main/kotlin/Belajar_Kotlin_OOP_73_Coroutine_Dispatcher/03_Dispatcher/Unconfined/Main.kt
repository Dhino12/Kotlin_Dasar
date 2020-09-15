package Belajar_Kotlin_OOP_73_Coroutine_Dispatcher.`03_Dispatcher`.Unconfined

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000L)
        println("Resume in ${Thread.currentThread().name}")
    }.start()
}
/*
* Artinya, coroutine telah dimulai dari main thread, kemudian tertunda oleh
* fungsi delay selama 1 detik. Setelah itu, coroutine dilanjutkan
* kembali pada thread DefaultExecutor.
* */