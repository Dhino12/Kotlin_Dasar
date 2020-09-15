package Belajar_Kotlin_47_Collection.`03_Map`

fun main() {
    println("============ mapOf ============")
        // diurutkan berdasarkan key dan value / <key ,value>
        // isinya tidak boleh kembar / duplicate
        // data tidak boleh di modifikasi
    val members = mapOf<Int,String>(
            1 to "Emilia",
            2 to "Salsa",
            3 to "Alpha"
    )
    for (key in members.keys){
        print("${members[key]} ")
    }
    println()
    println("key: " + members.keys.toList())
    println("values: " + members.values.toList())

    println("============ mutableMapOf ============")
    // diurutkan berdasarkan key dan value / <key ,value>
    // isinya tidak boleh kembar / duplicate
    // data boleh di modifikasi
    val members2 = mutableMapOf<Int,String>(
            1 to "Yue",
            2 to "Fiona",
            3 to "Millefeuille"
    )
    println("key: " + members2.keys.toList())
    println("values: " + members2.values.toList())
    members2.put(4,"Ani")
    println("values: " + members2.values.toList())
    members2.remove(4)
    println("values: " + members2.values.toList())
}