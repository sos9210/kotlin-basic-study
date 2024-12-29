fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("$score is negative.")
    }
}
fun getPassFail(score: Int) : String {
    return if(score >= 50) {
        "P"
    } else if(score >= 20) {
        "F"
    } else {
        "A"
    }
}

fun getPass (score: Int) : String {
    return if(score in 0..100) {
        "A"
    } else {
        "B"
    }
}

fun getGradeWithSwitch(score: Int) : String {
//    return when(score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }
    return when(score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}