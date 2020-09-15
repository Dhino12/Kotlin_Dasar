package Belajar_Kotlin_16_Break_Return_Continue_Range

fun main() {
    // Break | Continue | Return | Range

    val rangeInt = 1..10
    println("Range: ${rangeInt.toList()}")
    // ===============================
    // scara default step berniai 1
    val rangeStep = rangeInt.step
    println("Range Step : $rangeStep")
    // ===============================
    // step setiap ke 3
    val rangeStep3 = rangeInt.step(3)
    println("Range Step 3: ${rangeStep3.toList()}")

    val rangeTO = 1.rangeTo(10)
    println("RangeTo: " + rangeTO.toList())
    val downInt = 10.downTo(1)
    println("downInt: " + downInt.toList())
    val rangeChar = 'A'.rangeTo('K')
    println("rangeChar: " + rangeChar.toList())

    var a = 0
    while (true) {
        a++
        if (a == 10) {
            println("Looping ke: $a")
            break //Berhenti Proses Looping
        } else if (a == 6) {
            continue  //Skip proses looping
        } else if (a == 8) {
            println("Keluar Program: $a")
            return  //Keluar dari semua Statement
        }
        println("Looping ke: $a")
    }
    println("Keluar Looping ke: $a")

}