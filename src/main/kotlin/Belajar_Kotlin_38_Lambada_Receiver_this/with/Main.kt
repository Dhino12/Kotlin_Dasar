package Belajar_Kotlin_38_Lambada_Receiver_this.with

fun main() {
    // Pada dasarnya fungsi with bukanlah sebuah extension melainkan
    // hanyalah fungsi biasa.
    // Konteks objeknya disematkan sebagai argumen dan dari
    // blok lambda diakses sebagai receiver.
    val message = "Hello Kotlin"
    val result = with(message){
        println("value is $this")
        println("with length is ${this.length}")
        "test"
    }
    println("$result \n")

    val message2 = "Hallo Chino"
    val result2 = with(message2){
        """
            First Character is ${this[0]}
            Last Character is ${this[this.length - 1]}
        """.trimIndent()
    }
    println(result2)
}