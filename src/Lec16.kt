/**
 * 확장함수
 *   1.어떤 클래스의 메서드(함수) 인 것처럼 호출할 수 있게 선언할 수 있다.
 *   2.클래스를 상속받지 않고도 확장이 가능하다.
 *   3.확장함수는 수신객체 클래스의 캡슐화를 깨지 않기위해 private protected 멤버를 호출할 수 없다
 *   4.확장함수와 멤버함수의 시그니처가 같다면 멤버함수를 우선으로 호출한다.
 *   5.오버라이드시 현재 변수의 타입이 우선되어 호출된다.
 *       ex
 *      (val child: 자식 = 자식()  -> 자식이 오버라이드한 함수가 호출됨 )
 *      (val parent: 부모 = 자식() -> 부모가 선언한 함수가 호출됨 )
 */
/**
 * 중위함수(infix)
 *    1.downTo , step 등 모두 중위함수다. ( 변수 함수이름 argument )
 *    2. 선언시 infix fun .... { } infix 키워드를 붙여서 사용한다
 */
/**
 *  inline함수
 *      1.함수 호출 지점에 함수 본문을 복사 붙여넣기 하고 싶을때 사용한다. ( 3.add(4) )
 *      2.선언시 inline fun .... { } inline 키워드를 붙여서 사용한다.
 *      3.inline 함수는 성능 측정과 신중하게 사용해야한다.
 */
/**
 * 지역함수
 *      1. 함수안에 함수를 선언한다.
 *      2. 스코프는 현재 함수 안으로만 한정된다.
 *      3. depth가 깊어지므로 코드가 난잡해질 가능성이 있다.
 */
fun main() {
    //확장함수 호출
    val str = "ABC"
    println(str.lastChar())

    println()

    //infix 함수 호출
    val result1 = 3 add1 4
    println(result1)

    println()

    //inline 함수 호출
    //바이트코드상 실제 함수호출이 아닌 함수의 본문이 복사 붙여넣기 된다..
    // 잘 사용되지 않는 방법인듯
    val result2 = 3.add2(4)
    println(result2)

    println()
    
    //지역함수 호출
    println(3.add3(5))
}
// String 클래스를 확장하는 함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}

//infix 함수 정의
infix fun Int.add1 (other: Int) : Int{
    return this + other
}

//inline 함수 정의
inline fun Int.add2 (other: Int) : Int{
    return this + other
}

//지역함수 함수 정의
fun Int.add3 (other: Int) : Int{
    fun add3_1(arg1: Int, arg2: Int) : Int{
        return arg1 + arg2
    }

    return add3_1(this,other)
}