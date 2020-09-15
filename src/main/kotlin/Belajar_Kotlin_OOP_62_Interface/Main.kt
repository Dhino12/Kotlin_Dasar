package Belajar_Kotlin_OOP_62_Interface

interface IFly{
    fun fly()
    val numberOfWings:Int
}

class Bird(override val numberOfWings: Int) :IFly{
    override fun fly() {
        if(numberOfWings > 0 ) println("I Fly with $numberOfWings wings")
        else println("Im Flying without wings")
    }
}
fun main() {
    /*
    * Interfaces merupakan suatu konsep sifat umum
    * yang nantinya digunakan oleh suatu kelas agar dapat memiliki sifat tersebut
    * */
    val burung = Bird(2)
    burung.fly()
}