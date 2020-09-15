package Belajar_Kotlin_30_Function_Default_Arguement

fun main() {
    println(getFullName("Chino","Kafuu"))
    println(getFullName("Writer"))
}

fun getFullName(
        first:String = "Kotlin",
        middle:String = "IS",
        last:String = "Awesome"
):String{
    return "$first $middle $last"
}