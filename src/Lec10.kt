interface Flyable {
    // 코틀린에서는 default메서드 구현시 default키워드를 작성하지 않아도 구현부를 작성하면 default로 인식한다.
    fun act() {
        println("파닥파닥")
    }
}
interface SwimAble {
    val swimAbility: Int
        get() = 3;

    fun act() {
        println("허우적허우적")
    }
}

abstract class Animal (
    protected val species: String,
    protected open val legCount: Int,
){
    abstract fun move()

}

class Cat (
    species: String,
    legCount: Int,
): Animal(species, 4){

    override fun move(){
        println("고양이가 사뿐사뿐 걸어갑니다.")
    }
}

class Penguin (species: String) : Animal(species,2), SwimAble, Flyable {

    private val wingCount: Int = 2;

    override fun move(){
        println("펭귄이 걸어갑니다.")
    }

    //상위 클래스의 getter, setter를 오버라이드 하려면 상위클래스 프로퍼티에 open키워드를 붙여줘야한다.
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<SwimAble>.act();
        super<Flyable>.act();
    }
}