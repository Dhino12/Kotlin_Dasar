package Belajar_Kotlin_38_Lambada_Receiver_this.apply

fun main() {
    // nilai yang dikembalikan dari fungsi apply adalah nilai dari
    // konteks objeknya dan objek konteksnya tersedia sebagai receiver (this).

    val builder = StringBuilder()
    builder.append("Hello")
    builder.append("Kotlin")

    println(builder.toString())

    val message = StringBuilder().apply {
        builder.append("Hello")
        builder.append("Kotlin")
    }
    println(message.toString())
}