package Belajar_Kotlin_OOP_68_Variance.`02_Contravariant`

interface Comparable<in T>{
    operator fun compareTo(other:T):Int
}
/*
* Nilai dari tipe parameter tersebut bisa dikonsumsi dengan menjadikannya
* sebagai argumen untuk setiap fungsi yang ada di dalam kelas tersebut
* dan tidak untuk diproduksi.
* */