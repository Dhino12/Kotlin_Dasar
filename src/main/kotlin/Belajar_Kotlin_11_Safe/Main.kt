package Belajar_Kotlin_11_Safe

fun main() {
    println("========= Safe Calls Operator(?.) =========")
    var text :String? = null
    text?.length
    println("Panjang Text: ${text?.length}")
    text = "Chino"
    println("Panjang Text: ${text?.length}")

    println("========= Elvis Operator (?:) =========")
    var name:String? = null
    var textLength: Int?
    textLength = name?.length ?: 0
    println("Panjang Text: $textLength")

    name = "Cocoa"
    textLength = name?.length ?: 0
    println("Panjang Text: $textLength")

    println("========= Non Null Assertion (!!) =========")
    var names :String? = null
    // error karena names harus disi / tidak boleh null
    // INi Tidak Disarankan !!
    // textLength = names!!.length
    // println("Panjang Text: $textLength")
    names = "rize"
     textLength = names!!.length
     println("Panjang Text: $textLength")

}