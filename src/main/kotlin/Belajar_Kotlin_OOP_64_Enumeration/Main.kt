package Belajar_Kotlin_OOP_64_Enumeration

/*
* Enumeration merupakan salah fitur yang bisa kita gunakan untuk menyimpan kumpulan objek
* yang telah didefinisikan menjadi tipe data konstanta
* */
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    val warna = Warna.BIRU
    println(warna)
    println(colorBlue)
    println()

    val colors:Array<Color> = Color.values()
    colors.forEach { 
        color -> print("$color ")
    }

    println("\n")
    // untuk mendapatkan nama dari objek Enum
    /*
    * perhatikan argumen yang kita masukkan ke dalam fungsi tersebut.
    * Jika argumen yang
    * kita masukan tidak sama dengan salah satu objek enum maka akan
    * terjadi kesalahan IllegalArgumentException.
    * */
    val warna2 :Color = Color.valueOf("RED")
    println("Color is $warna2")
}

enum class Color(val value:Int){
    RED(0xFF00000){
        override fun printValue(){
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue(){
            println("value of GREEN is $value")
        }
    },
    BLUE(0x00000F){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };
    abstract fun printValue()
}

enum class Warna{
    MERAH,HIJAU,BIRU
}
