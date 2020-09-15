package Belajar_Kotlin_34_Lambada_Anonymous_Function

fun main() {
    message()
    printMessage("Yogyakarta")
    println("Panjang Pesan: " + lengthMessage("Yahhallo"))
}

val message = { println("Hello From Lambada")}
val printMessage = {message:String -> println("Hello From $message")}
val lengthMessage = { message:String -> message.length}