package Belajar_Kotlin_OOP_59_Exception_Handling.`01_ArithmeticException`

import java.lang.ArithmeticException

// Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch.
fun main() {
    /*
    * ArithmeticException merupakan exception yang terjadi karena kita membagi suatu
    * bilangan dengan nilai nol.
    * */
    try {
        val someValue = 0
        println(someValue / 0)
    }catch (e:ArithmeticException){
        System.err.println("Membagi suatu bilangan 0 ")
    }
}
/*
* kode yang dapat membangkitkan suatu exception disimpan dalam blok try, dan
* jika exception tersebut terjadi,
* maka blok catch akan terpanggil. Berikut cara penulisan try-catch pada Kotlin
* finally akan dieksekusi setelah program keluar dari blok try ataupun catch.
* Bahkan finally juga tereksekusi ketika terjadi exception yang tidak terduga.
* */