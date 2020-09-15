package Belajar_Kotlin_07_Operator_Komparasi

fun main() {
    // Operator Logika --> Opeerasi yang digunakan pada boolean
    // || , && , !

    //==========================================
    // karena menggunakan operator '==' yang artinya membandingkan alamat
    // di memori bukan nilainya

    // Operator Logika --> Opeerasi yang digunakan pada boolean
    // || , && , !

    //==========================================
    // karena menggunakan operator '==' yang artinya membandingkan alamat
    // di memori bukan nilainya
    val s1 = "geeksquiz"
    val s2 = "geeksquiz"
    println("s1 == s2 is:$s1" === s2)
    //============================================

    //============================================
    var a: Boolean?
    var b: Boolean?
    var c: Boolean
    a = true
    b = true
    println("\n===== OR ( || ) =====")
    c = a || b
    println("$a || $b = $c")
    a = false
    c = a || b
    println("$a || $b = $c")
    a = true
    b = false
    c = a || b
    println("$a || $b = $c")
    a = false
    b = false
    c = a || b
    println("$a || $b = $c\n")

    println("===== AND ( && ) =====")
    a = true
    b = true
    c = a && b
    println("$a && $b = $c")
    a = false
    b = true
    c = a && b
    println("$a && $b = $c")
    a = true
    b = false
    c = a && b
    println("$a && $b = $c")
    a = false
    b = false
    c = a && b
    println("$a && $b = $c\n")

    println("===== XOR ( ^ ) =====")
    a = true
    b = true
    c = a xor b
    println("$a ^ $b = $c")
    a = false
    b = true
    c = a xor b
    println("$a ^ $b = $c")
    a = true
    b = false
    c = a xor b
    println("$a ^ $b = $c")
    a = false
    b = false
    c = a xor b
    println("$a ^ $b = $c\n")

    println("===== NOT ( ! ) =====")
    a = true
    println("!" + a + " = " + !a)
    a = false
    println("!" + a + " = " + !a)
}