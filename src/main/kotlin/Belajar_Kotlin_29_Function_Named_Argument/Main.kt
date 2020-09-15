package Belajar_Kotlin_29_Function_Named_Argument

fun main() {
    val fullName = getFullName("Latina","von","Astrea")
    println(fullName)

    // =================== Named Argument ===================
    println(getFullName(middle = "Chino",last = "Kafuu",first = ""))
}

fun getFullName(first:String, middle:String ,last:String):String{
    return "$first $middle $last"
}