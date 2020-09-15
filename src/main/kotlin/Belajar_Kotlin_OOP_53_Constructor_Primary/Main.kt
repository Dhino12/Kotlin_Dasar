package Belajar_Kotlin_OOP_53_Constructor_Primary

// Penulisan Primary Constructor pada headClass dengan val atau var
class Animal(val name:String, val weight: Double ,val age:Int, val isMamalia:Boolean = true)

class Hewan(pName:String,pWeight:Double,pAge:Int,pIsMamalia:Boolean){
    val name:String
    val weight:Double
    val age:Int
    val isMamalia:Boolean

    // blok init = membantu memvalidasi sebuan nilai property sebelum diinisalisai
    // contohnya, kita dapat melakukan verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari nol.
    // init akan berjalan pertama kali
    init {
        this.weight = if(pWeight < 0) 0.1 else pWeight
        this.age = if(pAge < 0) 0 else pAge
        this.name = pName
        isMamalia = pIsMamalia
    }
}
fun main() {
    val myNeko = Animal("Goose",4.2,2,true)
    println("""
        Nama       : ${myNeko.name}
        age        : ${myNeko.age} 
        weight     : ${myNeko.weight} 
        isMamalia? : ${myNeko.isMamalia} 
    """.trimIndent())

    val myKucing = Hewan("Neko",4.2,2,true)
    println("""
        Nama       : ${myKucing.name}
        age        : ${myKucing.age} 
        weight     : ${myKucing.weight} 
        isMamalia? : ${myKucing.isMamalia} 
    """.trimIndent())

}

// Primary constructor juga dapat memiliki nilai default, dengan
// begitu jika kita tidak menetapkan nilai untuk parameter
// tersebut maka properti tersebut akan memiliki nilai default.

/*
* Kata kunci this tersebut merujuk kepada suatu kelas dimana jika
* kita menggunakannya diikuti dengan nama properti maka kita menunjuk
* pada properti yang terdapat pada kelas tersebut.
* */