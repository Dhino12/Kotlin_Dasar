package Belajar_Kotlin_48_Collection_Operation

fun main() {
    val numbers = mutableListOf(1,2,3,4,5,10,20,30)
    println("============ Filter ============")
    val genap = numbers.filter {
        // it < 10
        it % 2 == 0
    }
    println("Genap: " + genap.toList())

    println("============ Map ============")
    val doubled = numbers.map {
        x -> x * 2
    }
    println(doubled.toList())

    println("============ Union ============")
    // untuk gabungan
    val setA = setOf(1,2,4,2,1,5)
    val setB = setOf(10,20,4,5)
    val union = setA.union(setB)
    println(union)

    println("============ intersec ============")
    // untuk mengatahui irisan / nilai yang sama
    val setC = setOf(1,2,4,2,1,5)
    val setD = setOf(10,2,4,1)
    val intersect = setC.intersect(setD)
    println(intersect)

    println("============ put ============")
    val mutableC = mutableMapOf<Int, String>(
            1 to "Ratura",
            2 to "Champe",
            3 to "Maryberry"
    )
    println(mutableC.toList())
    mutableC.put(4,"Ani")
    println(mutableC.toList())

    println("============ add ============")
    numbers.add(1000)
    println(numbers.toList())

    println("============ filterNot ============")
    val newNumbers = numbers.filterNot { it % 2 == 0 }
    println("Ganjil: $newNumbers")

    println("============ count ============")
    println("Total arrayNewNumbers: " + newNumbers.count())
    println("Total : " + newNumbers.count{it % 3 == 1})

    println("==== find,firstOrNull,lastOrNull ====")
    println(mutableC.values.find { it == "Champe" })
    println(mutableC.values.firstOrNull{it == "Uraka"})
    println(mutableC.values.lastOrNull())

    println("============ first & last ============")
    println("item pertama: " + setC.first())
    println("item terakhir: " + setC.last())

    println("============ sum ============")
    println("Total value Array : " + numbers.sum())

    println("============ sorted ============")
    println("Ascending: " + numbers.sorted())
    println("Descending: " + numbers.sortedDescending())

    println("============ Any ============")
    println(mutableC.values.any{
        it.contains("Rat")
    })
    println("============ all ============")
    println(mutableC.values.all{
        it.contains("Rat")
    })
    println("============ none ============")
    println(mutableC.values.none(){
        it.contains("Rat")
    })
    println("============ fold ============")
    val fold = newNumbers.fold(10){
        current, item -> println("Current: $current")
        println("item: $item")
        println()
        current + item
    }

    println("Fold result: $fold" )
    println("============ foldRight ============")
    /*
    * fungsi foldRight() akan melakukan proses iterasi dari indeks terakhir
    * dan posisi dari argumen pada lambda expression nya pun berbeda,
    * */
    val foldR = newNumbers.foldRight(10){
        item,current ->  println("Current: $current")
        println("item: $item")
        println()
        item + current
    }
    println("FoldRight result: $foldR" )

    println("============ drop ============")
    val sisa = numbers.drop(4)
    println(sisa.toList())
    println("============ dropLast ============")
    val sisa2 = numbers.dropLast(4)
    println(sisa2.toList())
    println("============ take ============")
    val take = numbers.take(4)
    println(take.toList())
    println("============ takeLast ============")
    val takeL = numbers.takeLast(4)
    println(takeL.toList())
    println("============ slice ============")
    val indexPos = listOf(4,2,5,6,1)
    val total = listOf(1,2,3,4,5,6,7,8,9,10)
    var slice = total.slice(3..6)
    println("without step: $slice")
    slice = total.slice(4..8 step 2)
    println("with step: $slice")
    val sliceIndex = total.slice(indexPos)
    println("sliceIndex: $sliceIndex")
    println("============ Distinct ============")
    // mentaring item yang sama
    val total2 = listOf(1,2,3,4,1,3,4,5)
    val distinc = total2.distinct()
    println(distinc)
    println("============ DistinctBy ============")
    val textChar = listOf("A","BB","CC","DD","EEE","F","GGGGG")
    val distinc2 = textChar.distinctBy {
        it.length
    }
    println(distinc2)
    println("============ Chunked ============")
    val word = "Chino-chan"
    var chunked = word.chunked(2)
    println(chunked)
    chunked = word.chunked(2){
        it.toString().toUpperCase()
    }
    println(chunked)
}