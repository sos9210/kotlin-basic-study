import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val toInt = parseIntOrThrowV1("123")
    println(toInt)
}
fun parseIntOrThrowV1(str: String) :Int {
    try {
        return str.toInt()
    }catch (e:NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}은 문자열이 아닙니다.")
    }
}
fun parseIntOrThrowV2(str: String) :Int? {
    return try {
        str.toInt()
    }catch (e:NumberFormatException){
        null
    }
}
fun parseIntOrThrowV3(str: String) :Int? {
    return try {
        str.toInt()
    }catch (e:NumberFormatException){
        null
    }
}

// 코틀린에서는 모두 Unchecked Exception 이다.
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

//코틀린은 try with resources 구문이 없다.
fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
