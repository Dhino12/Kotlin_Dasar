package Belajar_Kotlin_47_Collection.`02_Set`

fun main() {
    // Set. Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
    // set ===============================
        // diurutkan berdasarkan index
        // isinya tidak boleh kembar / duplicate
        // data tidak boleh di modifikasi
    var members = setOf("Chiya","Sharo","Chiya")
    println(members.toList())

    // mutableSetOf ===============================
        // diurutkan berdasarkan index
        // isinya tidak boleh kembar / duplicate
        // data boleh di modifikasi
    val members2 = mutableSetOf("Emilia","Rem","Ram")
    members2.add("Puck")
    println(members2.toList())

}