package Belajar_Kotlin_OOP_71_Job.`02_Membatalkan_Job`

import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.CancellationException

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start New Job")
    }

    // ======== Membatalkan Job ========
    delay(2000)
    job.cancel(cause = CancellationException("Time Is Up"))
    println("Canceling Job")
    if(job.isCancelled){
        println("Job Is Cancelled")
        // untuk mendapatkan hasil dari cancellationException
        println("Because ${job.getCancellationException()}")
    }
}

/*
* Perlu diketahui bahwa jika cancel() dipanggil dalam job baru yang
* belum dijalankan, job tersebut tidak akan melalui state Cancelling,
* melainkan akan langsung memasuki state Cancelled.
* yaitu parameter cause yang bisa digunakan untuk memberitahu
* kenapa sebuah job dibatalkan.
* */