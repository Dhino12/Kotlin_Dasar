package Belajar_Kotlin_39_Lambada_Argument_it.also

fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")
}

/*
* Fungsi also sama seperti fungsi apply,
* di mana nilai yang dikembalikan adalah nilai dari konteks objek.
* Namun untuk konteks objeknya tersedia sebagai argumen (it).
* Fungsi also baiknya digunakan ketika kita ingin menggunakan
* konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
*/