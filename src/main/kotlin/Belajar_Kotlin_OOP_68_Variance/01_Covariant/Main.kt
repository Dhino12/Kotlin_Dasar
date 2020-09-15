package Belajar_Kotlin_OOP_68_Variance.`01_Covariant`

interface List<out  E> : Collection<E>{
    operator fun get(index:Int):E
}
/*
* Caranya sama seperti ketika kita membuat generic kelas pada umumnya.
* Namun untuk tipe parameternya kita membutuhkan kata kunci out untuk covariant 
* atau kunci in untuk contravariant.
* */