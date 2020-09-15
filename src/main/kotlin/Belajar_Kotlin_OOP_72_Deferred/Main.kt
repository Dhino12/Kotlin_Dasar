package Belajar_Kotlin_OOP_72_Deferred

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getCapital():Int{
    delay(1000L)
    return 500000
}

suspend fun getIncome():Int{
    delay(1000L)
    return 750000
}

fun main() = runBlocking {

    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("""
        your profit ${income.await() - capital.await()}
    """.trimIndent())
}

/*
*  Hasil dari deferred tersedia ketika mencapai state completed dan dapat diakses dengan fungsi await.
* */