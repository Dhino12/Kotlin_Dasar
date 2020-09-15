package Belajar_Kotlin_47_Collection.`01_List`

fun main() {
    // Dengan List kita dapat menyimpan banyak data menjadi satu objek.
    // List ======================================
        // diurutkan berdasarkan index
        // isinya boleh kembar / duplicate
        // data tidak boleh di modifikasi
    val numberList :List <Int> = listOf(1,2,3,4,5,1,3)
    val charList = listOf('Y','U','I')
    val anyList = listOf('Y',"U",1,true)
    println(numberList.toList())

    // mutableList ==================================
        // diurutkan berdasarkan index
        // isinya boleh kembar / duplicate
        // data boleh di modifikasi
    val members = mutableListOf<String>("Chino","Cocoa","Rize")
    members.add("Chiya")
    println(members.toList())
    members.removeAt(3)
    println(members.toList())
}