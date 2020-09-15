package Belajar_Kotlin_OOP_71_Job.`01_Memulai_Job`

import kotlinx.coroutines.*

// Job adalah sebuah hasil dari perintah asynchronous yang dijalankan.
fun main() = runBlocking {
//    val job = Job()
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start NEW Job")
    }

    // ======== Menjalankan Job ========
    job.start()
    // job.join() // atau menggunakan ini
    println("Other Task")
}

/*
* Jika Anda ingin membuat sebuah job tanpa langsung menjalankannya,
* Anda bisa memanfaatkan CoroutineStart.LAZY seperti
* ==================================================================
* Perbedaan dari keduanya adalah bahwa yang start() akan memulai job
* tanpa harus menunggu job tersebut selesai,
* sedangkan join() akan menunda eksekusi sampai job selesai.
* */