
fun main() {

}

class Person(name: String = "홍길동", var age: Int = 10) {
    init {
        if (age<=0) {
            throw IllegalArgumentException("나이는 $age 이하일 수 없습니다.")
        }
    }

    val name = name
        get() = field.uppercase()

    constructor() : this("홍길동",10)

    constructor(name: String): this(name,10);

    constructor(age: Int): this("홍길동",10);



}