package Belajar_Kotlin_OOP_52_Properties

class Animal {
    // properties =====================
    var name:String = "Neko"
    get( ){
        println("Fungsi Getter terpanggil")
        return field
    }
    set(value) {
        println("Fungsi Setter terpanggil")
        field = value
    }
}

fun main() {
    val myCat = Animal()
    println("Nama: ${myCat.name}")
    myCat.name = "Kucing"
    println("Nama : ${myCat.name}")
}