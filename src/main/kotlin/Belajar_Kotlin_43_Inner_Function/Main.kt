package Belajar_Kotlin_43_Inner_Function

import java.lang.IllegalArgumentException

fun sum(valueA :Int ,valueB:Int,valueC:Int): Int {
//    fun validateNumber(value:Int){
//        if(value == 0){
//            throw IllegalArgumentException("value must be better then 0")
//        }
//    }
    // =========== dengan extension Function ====================
    fun Int.validateNumber(){
        if(this == 0){
            throw IllegalArgumentException("value must be better then 0")
        }
    }
    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()
    // =========================================================
//    validateNumber(valueA)
//    validateNumber(valueB)
//    validateNumber(valueC)
    return valueA + valueB
}

fun main() {
    val result = sum(10,1020,20)
    println(result)
}