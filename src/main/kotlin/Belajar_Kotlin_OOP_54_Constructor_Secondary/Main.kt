package Belajar_Kotlin_OOP_54_Constructor_Secondary

class Hewan(pName:String,pWeight:Double,pAge:Int){
    var name:String
    var weight:Double
    var age:Int
    var isMamalia:Boolean

    init {
        this.weight = if(pWeight < 0) 0.1 else pWeight
        this.age = if(pAge < 0) 0 else pAge
        this.name = pName
        isMamalia = false
    }
    constructor(name:String, weight:Double, age:Int, isMamalia:Boolean):this(name,weight,age){
        this.isMamalia = isMamalia
    }
}

fun main() {
    val myKucing = Hewan("Neko",4.2,2,true)
    println("""
        Nama       : ${myKucing.name}
        age        : ${myKucing.age} 
        weight     : ${myKucing.weight} 
        isMamalia? : ${myKucing.isMamalia} 
    """.trimIndent())

}