package Belajar_Kotlin_OOP_58_Visibility_Modifiers.`01_Private`

class Human(private var name:String, val age:Int){
    fun getName():String{
        return name
    }
    fun setName(newName:String){
        name = newName
    }
}
fun main() {
    val herione1 = Human("Chino",10)
    // println("Name: ${herione1.name}") tidak bisa karena private
    println("""
        Name: ${herione1.getName()}
        Age : ${herione1.age}
    """.trimIndent())

    herione1.setName("Cocoa")

    println("""
        Name: ${herione1.getName()}
        Age : ${herione1.age}
    """.trimIndent())


}