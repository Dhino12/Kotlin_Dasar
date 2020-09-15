package Belajar_Kotlin_08_Mengambil_Input

fun main() {
    var a:Int
    var b:Int
    var hasil :Float

    print("Masukan Nilai A: ")
    a = readLine()?.toInt()!!
    print("Masukan Nilai B: ")
    b = readLine()?.toInt()!!
    hasil = a.toFloat() * b;
    println("Hasil : $hasil")
}