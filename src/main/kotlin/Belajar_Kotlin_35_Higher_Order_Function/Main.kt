package Belajar_Kotlin_35_Higher_Order_Function

fun main() {
    printResult(10, sum)
    printResult(10){
        value -> value + value
    }
}

fun printResult(value: Int,sum:(Int) -> Int){
    val result = sum(value)
    println(result)
}

var sum:(Int) -> Int = {value -> value + value}

// Konsep ini dinamakan sebagai Higher-Order Function,
    // yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
    // menjadikan tipe kembalian, ataupun keduanya