package Belajar_Kotlin_28_Latihan_Function

fun main() {
    val uang = 112000
    val total = belanja(arrayOf("monitor","mouse"))

    bayar(uang,total)
}

fun belanja(items:Array<String>):Int{
    var totalBelanja = 0
    for (item in items){
        when(item){
            "monitor" -> totalBelanja += 5000
            "mouse" -> totalBelanja += 10000
            "keyboard" -> totalBelanja += 20000
            else -> totalBelanja += 0
        }
    }
    return totalBelanja
}

fun bayar(uang:Int,total:Int){
    if(uang >= total){
        val hasil = uang - total
        println("Uang Kamu $total Cukup, kemabalian: $hasil")
    }else{
        println("Uang Kamu $total Belum Cukup")
    }
}