package Belajar_Kotlin_OOP_60_Overloading

import Belajar_Kotlin_26_Function.calculate

class Calculator{
    fun add(value1:Int,value2:Int) = value1 + value2
    fun add(value1:Double,value2:Double) = value1 + value2
    fun add(value1:Float,value2:Float) = value1 + value2
    fun add(value1:Float,value2:Double) = value1 + value2
}

class Animal(private var name:String){
    fun eat(){
        println("$name makan! ")
    }

    fun eat(typeFood:String){
        println("$name memakan $typeFood ")
    }

    fun eat(typeFood: String,quantity:Double){
        println("$name memakan $typeFood sebanyak $quantity grams")
    }

    fun sleep(){
        println("$name tidur!")
    }
}

fun main() {
    val kucing = Animal("Neko")
    kucing.eat()
    kucing.eat("IKan Tuna")
    kucing.eat("IKan Tuna",102.2)

    val calc = Calculator()
    println(calc.add(2.5,2.2))
    println(calc.add(10,2))
    println(calc.add(6f,7f))
}