package Belajar_Kotlin_38_Lambada_Receiver_this.run

fun main() {
    // Fungsi run akan mengembalikan nilai berdasarkan expression 
        // yang berada di dalam blok lambda.
    val text = "Hallo"
    val result = text.run {
        val from = this
        val to = this.replace("Hello","Kotlin")
        "Replace text $from to $to"
    }

    println(result)
}