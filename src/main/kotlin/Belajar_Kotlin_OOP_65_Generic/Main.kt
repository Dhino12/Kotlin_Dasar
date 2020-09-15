package Belajar_Kotlin_OOP_65_Generic

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList[0]
}

class ArrayList <T> : List<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}

interface List<T>{
    operator fun get(index: Int):T
}