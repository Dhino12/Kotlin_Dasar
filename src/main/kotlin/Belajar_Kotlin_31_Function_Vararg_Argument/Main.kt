package Belajar_Kotlin_31_Function_Vararg_Argument

// Dengan  vararg, sebuah fungsi dapat memiliki jumlah
    // parameter berdasarkan jumlah argumen yang
    // kita masukan ketika fungsi tersebut dipanggil
fun main() {
    println("======= Vararg =======")
    println(sumNumber(3,10))

    println("======= Vararg With Spread Operator =======")
    val number = intArrayOf(10,20,30,40)
    println(sets(1, 50, 60, *number ,90))

    println("======= Vararg Generic =======")
    val chars = charArrayOf('C','H','I','N','O')
    val i = asList(chars)[0]
    i.forEach {
        item -> print("$item ")
    }
}

fun sumNumber(vararg number:Int):Int{
    println("${number[0]} + ${number[1]}")
    return number.sum()
}

// ========= Generic untuk TIpe Parameter ===========
fun <T> asList(vararg input:T):List<T>{
    val result = ArrayList<T>()
    for (item in input){
        result.add(item)
    }
    return result
}
// ======= varargs dengan spread operator ==============
fun sets(vararg number: Int):Int{
    println(number.toList())
    return number.size
}

// pada dasarnya semua argumen yang dilampirkan,
// ditampung di  dalam sebuah Array <out T>

// ========== Peraturan Varargs ==============
//  1, di dalam sebuah fungsi,
    //  tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.
//  2. Selanjutnya, jika kita ingin menambahkan parameter baru tanpa
    //  kata kunci vararg, parameter yang ditandai dengan
    //   vararg harus berada pada posisi pertama