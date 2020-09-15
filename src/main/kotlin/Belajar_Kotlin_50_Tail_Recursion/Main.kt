package Belajar_Kotlin_50_Tail_Recursion

tailrec fun factorial(n:Int,result:Int):Int{
    val newResult = n * result
    return if(n == 1){
        newResult
    }else{
        factorial(n - 1,newResult)
    }
}

fun main() {
    // Dengannya, kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive. 
    // Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi
    // berikutnya dijalankan.
    // maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam
    // blok try-catch-finally.
    val angka = 3
    println(factorial(angka,5))
}