package Belajar_Kotlin_OOP_70_Coroutines_Async

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun getCapital():Int{
    delay(1000L)
    return 500000
}

suspend fun getIncome():Int{
    delay(1000L)
    return 750000
}

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
         val capital = getCapital()
         val income = getIncome()
         println("""
          your profit ${income - capital}
          """.trimIndent())
        // Pada kode di atas, kita menggunakan pendekatan sequential.
    }

    val timeTwo = measureTimeMillis {

        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("""
        your profit ${income.await() - capital.await()}
    """.trimIndent())
        // Lalu untuk mengakses hasil tersebut,
        // kita perlu menggunakan fungsi await.

    }
    println()
    println("""
        Completed in $timeOne ms [timeOne]
                vs
        Completed in $timeTwo ms [timeTwo]
    """.trimIndent())
}