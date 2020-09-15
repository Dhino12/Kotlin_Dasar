package Belajar_Kotlin_13_For_Loop

fun main() {
    val name = "chino"
    for (a in name){
        print("$a ")
    }

    println()

    println("====== dengan rangeTo ======")
    var ranges = 1..5
    var smallRange = 1..3
    val range = 1.rangeTo(10) // sama saja
    for (i in ranges){
        print("$i ")
    }

    println("\n====== dengan step ======")
     // step = langkahi 2
    print("Step: ")
    for (i in range step 2){
        print("$i ")
    }

    println("\n====== dengan index ======")
    for ((index ,value) in range.withIndex()){
        println("$value index ke $index")
    }

    println("====== dengan forEach ======")
    smallRange.withIndex().forEach{
        (i,value) -> println("$value index ke $i")
    }
    println("====== dengan forEachIndexed ======")
    smallRange.forEachIndexed{
        index, value -> println("values $value index $index ")
    }
}