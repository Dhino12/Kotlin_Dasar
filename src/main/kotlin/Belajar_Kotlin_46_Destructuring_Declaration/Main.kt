package Belajar_Kotlin_46_Destructuring_Declaration

// Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel.
data class DataUser(val name:String,val age: Int){
    fun intro(){
        println("My name is $name, I am $age years old\"")
    }
}
fun main() {
    val dataUser = DataUser("Cocoa",14)
    val name = dataUser.component1()
    val age = dataUser.component2()
    dataUser.intro()
    println("My Name: $name \nage: $age")
}