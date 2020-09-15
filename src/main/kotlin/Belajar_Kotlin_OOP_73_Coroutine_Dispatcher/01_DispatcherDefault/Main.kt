package Belajar_Kotlin_OOP_73_Coroutine_Dispatcher.`01_DispatcherDefault`

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {  }
    // launch(Dispatchers.Default) {  } // secara explisit
}