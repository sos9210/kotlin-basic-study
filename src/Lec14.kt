fun main() {
    val dto1 = PersonDto("홍길동1",11)
    val dto2 = PersonDto("홍길동2",13)

    println(dto1)
    println(dto2)
}
//data 키워드를 사용하면 equals, toString, hashCode를 자동으로 만들어준다.
//lombok의 @Data와 비슷한듯
data class PersonDto (
    val name: String,
    val age: Int
)
/*-----------------------------------------------------*/
// when은 enum과 sealed클래스와 사용할때 더욱 효과적이다..
// Country의 값을 알고있기때문에 else가 필요없음
// Country에 새로운 필드가 추가되면 설정에따라 ide에서 알려주기도함.
fun handleCountry(country: Country) {
    when(country) {
        Country.KOREA-> println("Korea")
        Country.AMERICA-> println("America")
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}

// sealed class : 상속이 가능한 추상클래스를 만들되 외부에서 이 클래스를 상속받지 않았으면 할때 사용
// 컴파일 타임 때 하위클래스의 타입을 모두 기억한다.
// 런타임때 클래스타입이 추가될 수 없다.
sealed class Car (
    val name: String,
    val price: Long
)

class ACar : Car("A1",1000L)
class BCar : Car("B1",2000L)

fun handleCar(car: Car) {
    when (car) {
        is ACar -> println("ACar")
        is BCar -> println("BCar")
    }
}