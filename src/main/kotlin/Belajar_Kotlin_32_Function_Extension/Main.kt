package Belajar_Kotlin_32_Function_Extension

// Untuk mendeklarasikan sebuah extension functions,
    // kita perlu menentukan terlebih dahulu receiver type,
    // kemudian nama dari fungsi tersebut yang mana keduanya
    // dipisahkan oleh titik (.)
fun main() {
    10.printInt()
    println(100.tambah3())
}

fun Int.printInt(){
    println("value $this")
}

fun Int.tambah3(): Int {
    return this + 3
}


// Bisa kita perhatikan, kelas Int pada kode di atas
// digunakan sebagai receiver type,
// sedangkan kata kunci this adalah receiver type 
// yang bertindak sebagai objeknya.
// Nilai dari objek tersebut bisa digunakan di dalam
// extension yang sudah dibuat. 