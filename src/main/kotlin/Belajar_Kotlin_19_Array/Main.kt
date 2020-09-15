package Belajar_Kotlin_19_Array

fun main() {


    //Tipedata [] nama = {komponen - komponen};
    //  index  0 1 2


    //Tipedata [] nama = {komponen - komponen};
    //  index  0 1 2
    println("=== Array Assigment ===")
    val a = intArrayOf(1, 2, 3)
    println(a[0])
    println(a[1])
    println(a[2])

    //Deklarasi
    //Tipedata[] nama = new int[jumlahInt]

    //Deklarasi
    //Tipedata[] nama = new int[jumlahInt]
    println("=== Hanya Deklarasi Array ===")
    val arrayFloat = FloatArray(5)

    arrayFloat[3] = 11.6f

    println(arrayFloat[0])
    println(arrayFloat.get(1))
    println(arrayFloat[2])
    println(arrayFloat[3])
    println(arrayFloat[4])

    println("=== isi Array ===")
    println(a.toList())
    arrayFloat[1] = 1.2f
    arrayFloat.set(0, 20.2f)
    println(arrayFloat.toList())
    println("=== Panjang Array ===")
    println(a.size)
    println(arrayFloat.size)

}