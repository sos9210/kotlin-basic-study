//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    var str: String? = null;
    println(str?.length ?: 0)

    println(startWithNotNull("ABD"));
}
fun kotlinStartsWith1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("ㄴㄴ")
}

fun kotlinStartsWith2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun kotlinStartsWith3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith1(str: String?) : Boolean {
    if (str == null) {
        throw IllegalArgumentException("String cannot be null")
    }
    return str.startsWith("A")
}

fun startsWith2(str: String?) : Boolean? {
    if(str == null){
        return null;
    }
    return str.startsWith("A")
}

fun startsWith3(str: String?) : Boolean {
    if(str == null){
        return false;
    }
    return str.startsWith("A")
}

fun startWithNotNull(str: String?) : Boolean {
    return str!!.startsWith("A")
}