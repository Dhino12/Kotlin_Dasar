package Belajar_Kotlin_OOP_59_Exception_Handling.`03_NullPointerException`

import java.lang.NullPointerException

/*
* NPE terjadi karena sebuah variabel atau objek memiliki nilai null,
* padahal seharusnya objek atau variabel tersebut tidak boleh null.
* */
fun main() {
    try {
        val someValue:String? = null
        val someMostNotNullValue:String = someValue!!
    }catch (e: NullPointerException){
        System.err.println("Null Pointer Exception | tidak Boleh Null ")
    }finally {
        println("Finally")
    }
}