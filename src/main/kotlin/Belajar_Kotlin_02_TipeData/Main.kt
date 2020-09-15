package Belajar_Kotlin_02_TipeData

import java.lang.Boolean

fun main(){
    //Tipe Data Primitive
    // int | Double | Float | Char | Byte | Boolean | Short
    // Tipe Data Fundamental
    //String

    // val namaVariable:TipeData = value/nilai
    println("============= String ============")
    val name :String = "Mocha Hoto"
        // var dan val digunakan untuk mengotrol nilai / value
        // val = tidak bisa menguabah value
    // name = "latin" // tidak bisa
    var names: String = "Friend Chino"
        // var = Kita bisa mengubah value
    println(name)

    //Integer(Bilangan Bulat) ==========
    val i = 1
    println("============= Integer ============")
    println("Nilai Integer i: $i")
    println("Nilai Integer MAX: " + Int.MAX_VALUE)
    println("Nilai Integer MIN: " + Int.MIN_VALUE)
    println("Nilai Integer bytes: " + Integer.BYTES + " bytes")
    println("Nilai Integer bit: " + Integer.SIZE + " bit")
    println("i = $i")

    val a: Byte = 1
    println("============= Byte ============")
    println("Nilai Byte a: $a")
    println("Nilai Byte MAX: " + Byte.MAX_VALUE)
    println("Nilai Byte MIN: " + Byte.MIN_VALUE)
    println("Nilai Byte bytes: " + java.lang.Byte.BYTES + " bytes")
    println("Nilai Byte bit: " + java.lang.Byte.SIZE + " bit")

    val b: Short = 1
    println("============= Short ============")
    println("Nilai Short b: $b")
    println("Nilai Short MAX: " + Short.MAX_VALUE)
    println("Nilai Short MIN: " + Short.MIN_VALUE)
    println("Nilai Short bytes: " + java.lang.Short.BYTES + " bytes")
    println("Nilai Short bit: " + java.lang.Short.SIZE + " bit")

    val c: Long = 1
    println("============= Long ============")
    println("Nilai Long c: $c")
    println("Nilai Long MAX: " + Long.MAX_VALUE)
    println("Nilai Long MIN: " + Long.MIN_VALUE)
    println("Nilai Long bytes: " + java.lang.Long.BYTES + " bytes")
    println("Nilai Long bit: " + java.lang.Long.SIZE + " bit")

    val d = 1.1
    println("============= Double ============")
    println("Nilai Double d: $d")
    println("Nilai Double MAX: " + Double.MAX_VALUE)
    println("Nilai Double MIN: " + Double.MIN_VALUE)
    println("Nilai Double bytes: " + java.lang.Double.BYTES + " bytes")
    println("Nilai Double bit: " + java.lang.Double.SIZE + " bit")

    val e = 1.3f
    println("============= Float ============")
    println("Nilai Float e: $e")
    println("Nilai Float MAX: " + Float.MAX_VALUE)
    println("Nilai Float MIN: " + Float.MIN_VALUE)
    println("Nilai Float bytes: " + java.lang.Float.BYTES + " bytes")
    println("Nilai Float bit: " + java.lang.Float.SIZE + " bit")

    val f = 'c'
    println("============= Char ============")
    println("Nilai Char f: $f")
    println("Nilai Char MAX: " + Character.MAX_VALUE)
    println("Nilai Char MIN: " + Character.MIN_VALUE)
    println("Nilai Char bytes: " + Character.BYTES + " bytes")
    println("Nilai Char bit: " + Character.SIZE + " bit")

    // Char hanya dapat menyimapn satu karakter
    // dengan ini kita juga bisa menggunakan increment dan decrement

    var alfabet:Char = 'A';
    alfabet++
    println("increment: $alfabet")
    --alfabet
    println("decrement: $alfabet")
    val g = true
    println("============= Boolean ============")
    println("Nilai Boolean g: $g")
    println("Nilai Boolean MAX: " + Boolean.TRUE)
    println("Nilai Boolean MIN: " + Boolean.FALSE)
    println("Nilai Boolean bytes: " + 1 + " bytes")
    println("Nilai Boolean bit: " + 1 + " bit")
}