package Belajar_Kotlin_09_IF_ELSE

fun main() {
    print("Mau Jajan apa: ")
    var jajanan:String?
    jajanan = readLine().toString()
    if(jajanan == "ciki" || jajanan == "Cicik"){
        println("Harga 1000")
    }else if(jajanan == "Susu"){
        println("Harga 2000")
    }else{
        println("Harga 3000")
    }

    println()

    print("Masukan Nilai A: ")
    val a = readLine()?.toInt()!!
    print("Masukan Nilai B: ")
    val b = readLine()?.toInt()!!

    print("Masukan Operator: ")
    var operator = readLine()
    var result = if(operator == "+"){
        a + b
    }else if(operator == "-"){
        a - b
    }else if(operator == "*"){
        a * b
    }else if(operator == "/"){
        a / b
    }else if(operator == "%"){
        a % b
    }else{
        println("Operator tidak ditemukan")
    }

    println("Hasil = $result")
}