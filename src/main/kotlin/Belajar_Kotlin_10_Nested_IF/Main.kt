package Belajar_Kotlin_10_Nested_IF

fun main() {
    print("Mau Jajan apa: ")
    var jajanan = readLine().toString()
    print("Uang kamu: ")
    var uang = readLine()!!.toInt()

    if(jajanan == "ciki" && uang > 1000){
        println("Harga 1000 Uang Cukup")
        if(uang > 1000){
            uang -= 1000
            println("Kembalian: $uang")
        }else{
            println("Uang Pas")
        }
    }else if(jajanan == "Susu"){
        println("Harga 2000")
        if(uang > 2000){
            uang -= 2000
            println("Kembalian: $uang")
        }else if(uang < 2000){
            println("Uang Kurang")
        } else{
            println("Uang Pas")
        }
    }else{
        println("Tidak Jual Item")
    }
}