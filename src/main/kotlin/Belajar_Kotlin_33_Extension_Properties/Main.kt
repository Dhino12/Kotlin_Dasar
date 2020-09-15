package Belajar_Kotlin_33_Extension_Properties

fun main() {
    println(10.slice)

    println("======== Nullable Receiver ========")
    val value :Int? = null
    println(value.slice)
    println(null.printName)
}

val Int.slice:Int
    get() = this / 2

val Int?.slice:Int
    get() = if(this == null) 0 else this.div(2)

val String?.printName:String
    get() = this?.capitalize() ?: "Receiver Type Kosong"
// Yang perlu diketahui, extension tidak benar-benar
// mengubah sebuah kelas dengan menambahkan sebuah fungsi
// atau properti baru. Ini karena extension memiliki hubungan
// langsung dengan kelas yang ingin diperluas fungsionalitasnya.
// Sehingga extension properties hanya bisa dideklarasikan dengan
// cara menyediakan getter atau setter secara eksplisit.