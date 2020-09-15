package Belajar_Kotlin_23_Array_Multidimensi

import java.util.*

fun main() {

    println("===== Array2D =====")
    val array2D = arrayOf(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(7, 8, 9, 10, 11, 12))
    println(array2D[0].toList())
    println(array2D[1].toList())

    println("===== Array2D Deklarasi saja =====")
    //Array2D dengan deklarasi saja
    //int[baris][kolom]
    //Array2D dengan deklarasi saja
    //int[baris][kolom]
    val arrayAngka = Array(2) { IntArray(3) }
    println(arrayAngka[0].toList())
    println(arrayAngka[1].toList())

    println("===== Array2D Loop Manual =====")
    for (i in arrayAngka.indices) {
        print("[")
        for (element in arrayAngka[i]) {
            print("$element,")
        }
        print("]\n")
    }
    println("===== Array2D Loop ForEach =====")
    for (baris in arrayAngka) {
        print("[")
        for (angka in baris) {
            print("$angka,")
        }
        print("]\n")
    }
    println("===== Array2D Ragged =====")
    val arrayRegged = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6, 7),
            intArrayOf(8)
    )
    println(arrayRegged[0].toList())
    println(arrayRegged[1].toList())
    println(arrayRegged[2].toList())

    val arrayChar1 = charArrayOf('a', 'b', 'c')
    val arrayChar2 = charArrayOf('d', 'e', 'f')
    val arrayChar2D = arrayOf(
            arrayChar1,
            arrayChar2
    )

    println("===== ArrayMultidimensi Lebih Dalam =====")
    println(arrayChar2D)
    println("ArrayChar1 = " + Integer.toHexString(System.identityHashCode(arrayChar1)))
    println("ArrayChar2 = " + Integer.toHexString(System.identityHashCode(arrayChar2)))
    println(Arrays.toString(arrayChar2D))
    println(Arrays.deepToString(arrayChar2D))
}