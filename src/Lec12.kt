
fun main(){
    println(SingletonA.a)

    // 코틀린에서 익명클래스를 구현하는 방법
    moveSomething(object : Movable{
        override fun move() {
            println("움직인다.")
        }

        override fun fly() {
            println("날아간다.")
        }
    })
}

class Person2 (
    var name: String,
    var age: Int,
){
    //코틀린은 static개념이 없다.
    //따라서 static대신 companion object라는 키워드를 사용해서 아래 내용들은 static처럼 동작한다.
    //companion object : 클래스와 동행하는 유일한 오브젝트.
    // companion object 는 객체로 간주된다. 따라서 이름과 인터페이스를 구현이 가능하다.
    companion object Factory {
        // const가 없으면 런타임시 할당 const가 있으면 컴파일시 값이 할당된다.
        //val MIN_AGE = 1
        private const val MIN_AGE = 1
        fun newBaby(name:String):Person{
            return Person(name, MIN_AGE)
        }
    }
    //
    /**
     * private static final int MIN_AGE = 1;
     *
     * public static Person newBaby(String name) {
     *  return new Person(name,MIN_AGE);
     * }
     */
}
// 코틀린에서 싱글톤은 클래스에 object키워드만 붙여주면된다...
object SingletonA {
    var a:Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

interface Movable {
    fun move()
    fun fly()
}