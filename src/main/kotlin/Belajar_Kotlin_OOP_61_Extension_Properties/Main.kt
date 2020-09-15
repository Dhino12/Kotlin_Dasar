package Belajar_Kotlin_OOP_61_Extension_Properties


class Animal(var name:String,var weight:Double, var age:Int,var isMamalia:Boolean)

val Animal.getAnimalInfo:String
get() = """
    Nama    : ${this.name}     
    berat   : ${this.weight}
    umur    : ${this.weight}
    mamalia : ${this.isMamalia}
""".trimIndent()

fun main() {
    val kucing = Animal("Neko",5.0,2,true)
    println(kucing.getAnimalInfo)
}