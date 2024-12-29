
fun main(){
    repeat("aaa",123)

    // 기본값이 셋팅되어 있는경우 중간쪽에있는 파라미터를 생략하고싶으면
    // 이런식으로 명식적으로 파라미터명 = 값 으로 셋팅할 수 있다.
    repeat(str = "stttt", useNewLine = false)

    //가변인자를 넘기는 경우 콤마(,)를 사용해서 넘길 수 있고
    printAll("ㅁㅁ","ㅠㅠ","ㅊㅊ")

    //가변인자로 넘길때 배열인 경우 (*변수명) 으로 넘길수 있다 (스프레드 연산자 : *)
    val array = arrayOf("aa", "bb", "Cc")
    printAll(*array);
}

fun max1(a: Int, b: Int): Int {
    return if(a > b) {
        a
    }  else {
        b
    }
}
// if는 하나의 expression.. 따라서 block으로 묶는것이 아니라 = 기호를 사용할 수 있다.
// 또한 함수의 반환타입도 컴파일러가 추론하기때문에 생략 가능
fun max2(a: Int, b: Int) = if(a > b) a  else b


//자바에서는 메서드 파라미터에 미리 값을 셋팅하려는경우 오버로딩을 통해 해결했지만.
//코틀린에서는 디폴트값을 정의해서 하나의 함수로 깔끔하게 사용가능하다.
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str);
        } else {
            println(str);
        }
    }
}
// 물론 코틀린도 오버로딩 기능이 제공된다.
//fun repeat(str: String, num: String = "", useNewLine: Boolean = true) {
//
//}

// 코틀린에서 가변인자 (자바의 String... str 등) 는 vararg 라는 키워드를 사용해서 정의한다.
fun printAll(vararg strs: String) {
    for (str in strs) {
        println(str)
    }
}
