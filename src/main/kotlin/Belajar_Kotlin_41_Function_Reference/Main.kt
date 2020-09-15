package Belajar_Kotlin_41_Function_Reference

fun main() {
    // Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    /*
    * Selain itu, kita juga bisa mereferensikan sebuah extensions function.
    * Caranya dengan ikut menyertakan objek yang menjadi receivernya sebelum operator ::
    * */
    val eventAngka = numbers.filter(Int::isEvenAngka)
    println(eventAngka)
}

fun isEvenNumber(number:Int) = number % 2 == 0
fun Int.isEvenAngka() = this % 2 == 0