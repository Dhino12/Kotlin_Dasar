package Belajar_Kotlin_25_String_Operation

fun main() {
    val kalimat = "Hallo School"
    println("\n" + kalimat)

    println("========= Mengambil Panjang String =========")
    println("Panjang Kata: ${kalimat.length}" )

    println("========= Mengambil Komponen String =========")
    println(kalimat.get(1))

    println("========= Mengambil String dengan Range =========")
    val kata = kalimat.substring(6,12)
    println(kata)

    println("========= String Concatenation =========")
    val kalimat2 = "Another " + kata + " !!"
    println(kalimat2)

    println("==== String concat dengan NonString ====")
    val angka1 = 10
    val kalimat3 = kata + " " + angka1
    println(kalimat3)

    println("==== String lowercase & UPERCASE ====")
    println(kalimat.toUpperCase())
    println(kalimat.toLowerCase())

    println("==== String Replace ====")
    val kalimat4 = kalimat2.replace("School","Dunia")
    println(kalimat2)
    println(kalimat4)

    println("==== String Equals ====")
    println(kalimat.equals(kalimat2))

    println("==== String Compare ====")
    val Heroine1 = "Chino"
    val Heroine2 = "Cocoa"
    println(Heroine2.compareTo(Heroine1))
    println(Heroine1.compareTo(Heroine2))

    println("==== Cek String Kosong / Tidak ====")
    println(Heroine1.isEmpty())
    println(Heroine1.isNotEmpty())

    println("==== Cek Index String ====")
    println(Heroine1.indexOf("i"))

    println("==== Penghapus Spasi String Input ====")
    print("Masukan Favorite Heroine: ")
    val Heroine3 = readLine()
    println(Heroine3?.trim().toString())

    println("==== String Template ====")
    println("Haii $Heroine1")
    println("Name ${if(Heroine1 == "Chino" ) "Hallo Chino" 
                    else " Hai Semua "}"
    )
    println("==== String Reverse ====")
    println(Heroine1.reversed())
}