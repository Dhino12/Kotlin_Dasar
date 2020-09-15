package Belajar_Kotlin_OOP_73_Coroutine_Dispatcher.`02_Dispatcher_IO`

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch(Dispatchers.IO) {  }
}