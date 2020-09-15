package Belajar_Kotlin_42_Property_Reference

/*
* Operator :: juga dapat digunakan untuk mereferensikan
* sebuah properti. Dengan Operator, kita bisa mengakses apa yang menjadi bagian
* dari properti tersebut seperti nama, fungsi setter getter, dll.
* */
var message = "Kotlin"

fun main() {
    println(::message.name)
    println(::message.get())
    ::message.set("Kotlin Learning")

    println(::message.get())
}

/*
* Ekspresi ::message akan dievaluasi ke dalam objek dengan 
* KMutableProperty yang memungkinkan kita untuk membaca nilainya dengan menggunakan get(),
*  menetapkan nilai menggunakan set() dan mendapatkan nama dari properti tersebut menggunakan
* properti name.
* sedangkan untuk property immutable seperti val, KProperty hanya akan menghasilkan get()
* */