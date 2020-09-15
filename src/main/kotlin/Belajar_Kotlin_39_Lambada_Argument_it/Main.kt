package Belajar_Kotlin_39_Lambada_Argument_it

fun main() {
//    Selanjutnya, fungsi yang menggunakan lambda argument
    //    untuk mengakses konteks dari sebuah objek adalah
    //    fungsi let dan also.
    val text = "Hallo"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    val font = "Calibri"
    font.let {
        value -> val message = "$value Regular"
        println(message)
    }
}

// Berbeda dengan lambda receiver, nilai dari argumen tersebut
// dapat kita gunakan untuk diproduksi atau di inisialisasikan
// untuk variabel lain.
