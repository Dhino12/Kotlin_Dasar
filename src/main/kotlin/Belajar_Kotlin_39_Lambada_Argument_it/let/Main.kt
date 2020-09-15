package Belajar_Kotlin_39_Lambada_Argument_it.let

// Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
// Penggunaan fungsi let akan banyak kita temukan pada objek yang
// bertipe non-null.

fun main() {
    val message:String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
    // ingin menjalankan logika kode lain jika objeknya bernilai null?
    // Di sini kita akan memanfaatkan fungsi lainnya yaitu run.
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run {
        val text = "message is null"
        println(text)
    }
    // ======================= Atau ====================
    val pesan:String? = null
    val lengthPesan = pesan?.length ?: 0
    val textPesan = "text length $lengthPesan"
    println(textPesan)
}