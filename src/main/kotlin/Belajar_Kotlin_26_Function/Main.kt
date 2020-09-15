package Belajar_Kotlin_26_Function

fun main() {
    printText()
    printWarne("biru","hijau")

    println("=========================")
    print("Masukan Nilai 1: ")
    val angka1 = readLine()?.toInt()!!

    print("Masukan Nilai 2: ")
    val angka2 = readLine()?.toInt()!!
    println("======================== + ")
    println("Hasil\t\t\t: " + calculate(angka1,angka2))
}

fun printText(){
    println("Text 1")
    println("Text 2")
    println("Text 3")
}

// Fungsi tanpa kembalian atau Unit
fun printWarne(parameter1:String, parameter2:String):Unit{
    println("Warna 1: $parameter1")
    println("Warna 2: $parameter2")
}

// Fungsi dengan kembalian atau return
// fun namaFun(namaVariable1:TipeData):TIpeDataPengembalian{return}
fun calculate(num:Int,num2:Int):Int{
    val sum = num + num2
    return sum
}