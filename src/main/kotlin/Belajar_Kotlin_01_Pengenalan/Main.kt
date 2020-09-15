package Belajar_Kotlin_01_Pengenalan

fun main(){
    println("Haii")
    // Null Safe
    println("=== Ini Statement ===")
    // statement = inisialisasi dari variable
    var nama:String? = "Hallo ini statement"
    nama = null

    var umur :Int = 10 ?: 0;
    println(nama)

    println("=== Ini Expression ===")
    // expression = terdiri dari variable,operator,dan sesuatu yg
        // mengevaluasi nilai tunggal yang bisa disimapan kedalam variable
    if(nama != null){
        nama + " !!"
    }else{

    }
}