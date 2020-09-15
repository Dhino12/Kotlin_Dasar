package Belajar_Kotlin_21_Latihan_Menghitung_Tambang

fun main() {
    val treasure = arrayOf(
            "Gold","Gold","Silver","Silver",
            "ZONK","Silver","Gold","Zonk","Gold"
    )
    var gold = 0
    var silver = 0

    for (item in treasure){
        if(item == "Gold") gold++ else if(item == "Silver") silver++
    }

    println("Total Gold: $gold")
    println("Total Silver: $silver")
}