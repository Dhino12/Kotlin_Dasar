package Belajar_Kotlin_18_Nested_Loop

fun main() {

    for (i in 0..4) {
        for (j in 0..4) {
            print("* ")
        }
        println()
    }

    println()

    for (i in 0..4) {
        for (j in 0..4) {
            print("* ")
            if (i == j) {
                break
            }
        }
        println()
    }

    println()

    for (i in 0..4) {
        for (j in 0..4) {
            print("* ")
            if (i + j == 4) {
                break
            }
        }
        println()
    }

    println()

    for (i in 0..8) {
        for (j in 0..8) {
            print("* ")
            if (i == j) {
                break
            } else if (i + j == 8) {
                break
            }
        }
        println()
    }

    println()

    for (i in 1..5) {
        for (j in 5 downTo i + 1) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }

    for (i in 1..5) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in 5 downTo i) {
            print("*")
        }
        println()
    }

}