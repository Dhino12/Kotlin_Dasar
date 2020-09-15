package Belajar_Kotlin_45_DataClass

class User(val name:String,val age:Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

}

data class DataUser(val name:String,val age: Int)

fun main() {
    /*
    * Data class adalah sebuah kelas yang tidak memiliki logika apapun dan
    * juga tidak memiliki fungsionalitas lain selain menangani data.
    * Hanya dengan satu baris kode di atas, kompiler akan secara otomatis menghasilkan 
    * constructor, toString(), equals(), hashCode(), copy() dan juga fungsi componentN().
     */

    val user = User("Chino",10)
    val dataUser = DataUser("Cocoa",14)
    val dataUser2 = DataUser("Rize",14)
    val dataUser3 = DataUser("Chiya",14)
    val dataUser4 = dataUser.copy()
    println(user)
    println(dataUser)
    println()

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(dataUser.equals(dataUser4))
}