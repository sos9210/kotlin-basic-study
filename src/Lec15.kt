fun main() {
    array()

    println()
    /*-----------------------------------*/
    println()
    list()

    println()
    /*-----------------------------------*/
    println()

    set()

    println()
    /*-----------------------------------*/
    println()

    map()
}
private fun map() {
    // 가변 Map 선언
    val oldMap = mutableMapOf<Int, String>()

    //oldMap.put(1, "Kotlin")
    //oldMap[1] = "Kotlin"
    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in mapOf) {
        println(key)
        println(value)
    }
}
private fun set() {
    // 불변 set 선언
    val set = setOf(100L);
    // 가변 set 선언
    //val set = mutableSetOf(100L);

    for (i in set) {
        println("${i}")
    }
}
private fun list() {
    // 리스트 선언 (불변) : 요소를 추가 및 삭제가 불가능하다.
    val numbers = listOf(100, 200)

    // 리스트 선언 (가변)
    //val numbers = mutableListOf(100,200)

    val emptyList = emptyList<Int>()

    //리스트도 배열처럼 요소 접근가능
    println(numbers[0])

    for (value in numbers) {
        println("${value}")
    }
    for ((index, value) in numbers.withIndex()) {
        println("${index} , ${value}")
    }
}

private fun array() {
    // 배열선언
    val array = arrayOf(100, 200)


    //인덱스만 가져온다
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }
    // 인덱스와 값을 가져온다
    for ((i, value) in array.withIndex()) {
        println("${i} ${value}")
    }
    // 배열에 요소를 추가한다.
    val plus = array.plus(300)
    for ((i, value) in plus.withIndex()) {
        println("${i} ${value}")
    }
}
