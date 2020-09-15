package Belajar_Kotlin_OOP_58_Visibility_Modifiers.`03_Internal`

// Pada contoh di atas, kelas Animal telah ditetapkan sebagai kelas internal,
// maka kelas tersebut hanya dapat diakses dari modul/package yang sama.
internal open class Human(private var name:String, val age:Int, protected val weight:Double ){
    fun getName():String{
        return name
    }
    fun setName(newName:String){
        name = newName
    }
}

private class Chino(pName:String, pAge:Int, pWeight:Double):Human(pName,pAge,pWeight)

fun main() {
    val loli1 = Chino("Chino",10,20.9)
    println("""
        Name  : ${loli1.getName()}
        Age   : ${loli1.age}
    """.trimIndent())
    // println("weight   : ${loli1.weight}") karena access modifier = protected
}