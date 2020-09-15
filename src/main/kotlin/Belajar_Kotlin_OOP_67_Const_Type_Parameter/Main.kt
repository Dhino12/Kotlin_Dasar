package Belajar_Kotlin_OOP_67_Const_Type_Parameter

fun main() {
    val numbers = ListNumbers<Long>()
    val numbers2 = ListNumbers<Int>()
    // val numbers3 = ListNumbers<String>() error krna bkn numbers
}

class ListNumbers<T:Number> : List<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: T): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<T> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: T): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<T> {
        TODO("Not yet implemented")
    }
}

/*
* Dalam penerapan generic, kita bisa
* membatasi tipe apa saja yang dapat digunakan sebagai parameter.
* Untuk menentukkan batasan tersebut, bisa dengan menambahkan tanda
* titik dua (:) setelah tipe parameter yang kemudian diikuti oleh
* tipe yang akan dijadikan batasan.
* */