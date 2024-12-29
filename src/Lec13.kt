fun main() {

}
// 코틀린에서 내부클래스 (static inner class)
// 클래스안에 클래스를 그냥 작성하면 됨.
// 권장되는 방식
class JavaHouse1 (
    val address: String,
    val livingRoom: LivingRoom1
){
    class LivingRoom1 {

    }
}

//코틀린에서 내부클래스 (non static class)
// 권장되지 않는방식 (메모리 누수 위험)
// 바깥클래스를 참조함으로써 GC되지 않는 위험이 있음
class JavaHouse2 (
    val address: String,
    val livingRoom: LivingRoom2
){
    inner class LivingRoom2 {
        val address: String
            get() = this@JavaHouse2.address
    }
}