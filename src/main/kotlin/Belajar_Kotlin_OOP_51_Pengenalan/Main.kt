package Belajar_Kotlin_OOP_51_Pengenalan

class Animal(
        val name:String,
        val weight:Double,
        val age:Int,
        val isMamalia:Boolean
){
    fun eat(){
        println("$name makan!")
    }
    fun sleep(){
        println("$name tidur!")
    }
}

fun main() {
    val nameObject = Animal("Kucing",4.2,2,true)
    println("""
        Nama Hewan: ${nameObject.name}
        Berat Hewan: ${nameObject.weight}
        Umur Hewan: ${nameObject.age}
        isMamalia ?: ${nameObject.isMamalia}
    """.trimIndent())

    nameObject.eat()
    nameObject.sleep()
}