package Belajar_Kotlin_OOP_55_Constructor_Default

import Belajar_Kotlin_OOP_54_Constructor_Secondary.Hewan

class Animal(
        val name:String = "Kucing",
        val weight:Double = 4.2,
        val age:Int = 2,
        val isMamalia:Boolean = false
)

fun main() {
    val myKucing = Animal()
    println("""
        Nama       : ${myKucing.name}
        age        : ${myKucing.age} 
        weight     : ${myKucing.weight} 
        isMamalia? : ${myKucing.isMamalia} 
    """.trimIndent())
}