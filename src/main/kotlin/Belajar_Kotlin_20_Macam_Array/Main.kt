package Belajar_Kotlin_20_Macam_Array

fun main() {
    println("======= Spesifik Integer Array ======= ")
    val nums = intArrayOf(1,2,3,4,5)
    println(nums.toList())
    println("Max array nums : " + nums.max())
    println("Min array nums : " + nums.min())
    println("Average array : " + nums.average())
    println("first array : " + nums.first())
    println("lastIndex array : " + nums.lastIndex)
    println("last array : " + nums.last())
    println("total array : " + nums.count())

    println("======= Spesifik Char Array ======= ")
    val charName = charArrayOf('C','H','I','N','O')
    println("Total Array: " + charName.size)
    println("index Array ke2: " + charName.elementAt(2))

    println("======= Spesifik String Array ======= ")
    val stringName = arrayOf("Chino","Cocoa","Rize")
    println("Buang Array awal: " + stringName.toList())
    println("Buang Array akhir: " + stringName.dropLast(1))
    println("Buang Array awal: " + stringName.drop(1))

    println("======= Array Apapun ======= ")
    val anyName = arrayOf("Chino","Cocoa","Rize",1,2,true,'A')
    println("isi Array: " + anyName.toList())
}