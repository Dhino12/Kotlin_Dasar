package Belajar_Kotlin_05_Operator_Unary

fun main() {
    // unary = operasi yang dilakukan pada satu variable

    // unary = operasi yang dilakukan pada satu variable
    var angka = 12
    System.out.printf("Unary - %d = %d\n", angka, -angka)
    System.out.printf("Unary + %d = %d\n", angka, +angka)

    //Unary Decrement & Increment

    //Unary Decrement & Increment
    System.out.printf("Unary -- %d = %d [prefix] \n", angka, --angka)
    System.out.printf("Unary ++ %d = %d [prefix] \n", angka, ++angka)
    System.out.printf("Unary %d ++ = %d [postfix] \n", angka, angka++)
    System.out.printf("Unary %d -- = %d [postfix] \n", angka, angka--)
    System.out.printf("Unary %d menjadi %d\n", angka, angka)

    //Unary Boolean

    //Unary Boolean
    val hai = true
    println("Unary Boolean = $hai")
    println("Unary Boolean = " + !hai)
}