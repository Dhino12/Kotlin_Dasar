package Belajar_Kotlin_OOP_74_Channel

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking(CoroutineName("Main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1_Coroutine")) {
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5){ println(channel.receive())}
    println("Received in ${Thread.currentThread().name}")
}
/*
* Bisa dilihat bahwa pada coroutine v1_coroutine bahwa channels telah mengirimkan nilai
* dari hasil komputasi dengan menggunakan fungsi send.
* Setelah itu, di coroutine lain (main) channel menerima nilai dengan menggunakan fungsi receive.
* */