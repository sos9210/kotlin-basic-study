fun main() {
    val listOf = listOf(1, 2, 3)
    for (item in listOf) {
        println(item)
    }
    println("------------------------------")
    for(i in 1..listOf.size) {
        println(i)
    }
    println("------------------------------")
    for(i in 5 downTo 2) {
        println(i)
    }
    println("------------------------------")
    for(i in 1..5 step 1) {
        println(i)
    }

}