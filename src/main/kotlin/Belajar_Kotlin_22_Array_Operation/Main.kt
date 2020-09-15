package Belajar_Kotlin_22_Array_Operation

fun main() {
    val arrayAngka1 = arrayOf(1,2,3,4,5)

    println("======= Mencopy Array =======")
    val arrayAngka2 = arrayAngka1.copyOf()
    println("Array1: " + arrayAngka1.toList())
    println("Array2: " + arrayAngka2.toList())

    println("======= Array Loop =======")
    arrayAngka1.forEach {
        item -> print("$item ")
    }
    println()
    arrayAngka1.forEachIndexed{
        index,value -> print("$value index ke -$index \n")
    }
    println()
    for((index,item) in arrayAngka1.withIndex()){
        print("$item index ke -$index \n")
    }

    println("======= Array copyOfRange =======")
    val arrayAngka3 = arrayAngka2.copyOfRange(2,4)
    println("Array2: " + arrayAngka2.toList())
    println("Array3: " + arrayAngka3.toList())

    println("======= Array Fill =======")
    var arrayAngka5 = IntArray(10)
    println(arrayAngka5.toList())
    arrayAngka5.fill(5)
    println(arrayAngka5.toList())

    println("======= Comparasi Array =======")
    val arrayAngka6 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    val arrayAngka7 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println("Apakah Sama? " + (arrayAngka6.contentEquals(arrayAngka7)))
    arrayAngka7[3] = 12
    println("Apakah Sama? " + (arrayAngka6.contentEquals(arrayAngka7)))

    println("======= Total Array Value =======")
    println("Array6: " + arrayAngka6.sum())

    println("======= Rata-Rata Array Value =======")
    println("Array6: " + arrayAngka6.average())

    println("======= urutkan Array reverse =======")
    arrayAngka6.reverse()
    println("Array6: " + arrayAngka6.toList())

    println("======= urutkan Array sorting =======")
    arrayAngka6.sort()
    println("Array6: " + arrayAngka6.toList())

    println("======= Buang Array diawal =======")
    val arrayAngka8 = arrayAngka6.drop(4)
    println("Array8: " + arrayAngka8.toList())

    println("======= Buang Array diakhir =======")
    val arrayAngka9 = arrayAngka6.dropLast(4)
    println("Array9: " + arrayAngka9.toList())

    println("======= Search Array berdasarkan Index =======")
    val arrayAngka10 = arrayAngka2.binarySearch(3)
    arrayAngka2.forEachIndexed{
        index ,value -> if(index == arrayAngka10){
            println("Array10: $value index ke $index")
        }
    }
    println("Array10: $arrayAngka10")

    println("======= Jumlah Dua Array =======")
    val hasil: IntArray = tambahArray(arrayAngka1,arrayAngka2)
    println("Hasil 2 Array: " + hasil.toList())

    println("======= Gabung Dua Array =======")
    val arrayGabungan = gabungArray(arrayAngka1,arrayAngka2)
    println("Hasil Gabungan: " + arrayGabungan.toList())
}

fun gabungArray(array1: Array<Int>, array2: Array<Int>):IntArray{
    val arrayGabungan = IntArray(array1.size + array2.size)
    for (i in array1.indices){
        arrayGabungan[i] = array1[i]
    }
    for (j in array2.indices ){
        arrayGabungan[j + array2.size] = array2[j]
    }
    return arrayGabungan
}
fun tambahArray(array1:Array<Int>,array2:Array<Int>): IntArray {
    val arrayHasil = IntArray(array1.size)
    if(array1.size == array2.size){
        for (i in array1.indices) {
            arrayHasil[i] = array1.get(i) + array2.get(i)
        }
    }else{
        println("Kedua Array Berbeda......")
    }
    return arrayHasil
}

