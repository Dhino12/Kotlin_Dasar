package Belajar_Kotlin_24_String

fun main() {

    var kataStr = "Hallo"
    val kataChr = charArrayOf('H', 'a', 'l', 'l', 'o')
    val kalimat1 = String(kataChr)

    println(kataStr)
    println(kataChr)
    println(kalimat1)

    println("Komponen Char " + kataChr[0])
    println("Komponen String " + kataStr[1])

    //Merubah Komponen String
    //Merubah komponen String !TIDAK BISA!, karena di java immutable
    // kataStr[0] = "C"; <---- Tidak bisa
    // kataStr.charAt(0) = "C"; <---- Tidak bisa

    //Merubah Komponen String
    //Merubah komponen String !TIDAK BISA!, karena di java immutable
    // kataStr[0] = "C"; <---- Tidak bisa
    // kataStr.charAt(0) = "C"; <---- Tidak bisa
    val kataString = "C" + kataStr.substring(1, 5) // dengan method

    println(kataStr)
    println("KataString: " + kataStr)
    println("KataString: " + kataString)

    //Memori String (String Pool = 1 Slot memori for String)

    //Memori String (String Pool = 1 Slot memori for String)
    val str1 = "Hallo"
    val str2 = "tester"
    var str3 = "testing"
    println("KataString: $str1")
    println("KataString: $str2")
    println("str3: $str3")

    str3 = str3.substring(0, 4) // dengan method

    println("str3: $str3")

    val str4 = "Callo"
    println("str4: $str4")

    kataStr = "Callo"
    println("KataString: $kataStr")

    //1. String di java Immutable
    //2. String yang berada di String = reuseable
    //Memorinya lebih efesien
    //3. Membuat String dengan method baru maka akan ditaruh di memori lain
    //bukan di string pool

    //1. String di java Immutable
    //2. String yang berada di String = reuseable
    //Memorinya lebih efesien
    //3. Membuat String dengan method baru maka akan ditaruh di memori lain
    //bukan di string pool
    val a = "Hallo"
    println("a: " + a)

    println("====== Escaped String ======")
    val statement = "Kotlin is \" Awesome \""
    println(statement)
    println("Unicode test \u0394")

    println("====== RAW String ======")
    println("""
        Line 1
        Line 2 
        Line 3
        Line 4
    """.trimIndent())
}
