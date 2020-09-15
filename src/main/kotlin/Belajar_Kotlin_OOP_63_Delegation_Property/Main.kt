package Belajar_Kotlin_OOP_63_Delegation_Property

import kotlin.reflect.KProperty

// Delegation = class yang digunakan untuk mengatur getter dan setter
class DelegationName{
    private var value:String = "Default"
    operator fun getValue(classRef:Any?,property:KProperty<*>):String{
        println("Fungsi ini sama seperti getter untuk property ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef:Any?,property:KProperty<*>,newValue:String){
        println("Fungsi ini sama seperti getter untuk property ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal{
    var name:String by DelegationName()
}

class Person{
    var name:String by DelegationName()
}

fun main() {
    println()
    val animal = Animal()
    animal.name = "Tomy"
    println("Nama ${animal.name}")

    println()
    val person = Person()
    person.name = "Rico"
    println("Nama ${person.name}")
}