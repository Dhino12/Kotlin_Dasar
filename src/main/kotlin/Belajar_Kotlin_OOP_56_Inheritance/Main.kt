package Belajar_Kotlin_OOP_56_Inheritance

/*
* Untuk membuat sebuah super atau parent class kita akan membutuhkan open class
* Kelas pada Kotlin secara default bersifat final,
* oleh karena itu kita harus mengubahnya menjadi open class sebelum melakukan extends kelas tersebut. 
* */
open class Animal(val name:String,val weight:Double,val age:Int,val isCarnivore:Boolean){
    open fun eat(){
        println("$name Sedang Makan")
    }

    open fun sleep(){
        println("$name Sedang Tidur")
    }
}

class Cat(
        pName:String,
        pWeight:Double,
        pAge:Int,
        pIsCarnivore:Boolean,
        val furColor:String,
        val numberOffet:Int
):Animal(pName,pWeight,pAge,pIsCarnivore){
    fun playWithHuman(){
        println("$name bermain bersama manusia")
    }

    override fun eat() {
        println("$name sedang Makan Ikan")
    }

    override fun sleep() {
        println("$name $furColor itu sedang tidur")
    }
}

fun main() {
    val myCat = Cat(
            "Neko",
            3.2,
            2,
            true,
            "Putih",
            2
    )
    myCat.playWithHuman()
    myCat.eat()
    myCat.sleep()
}