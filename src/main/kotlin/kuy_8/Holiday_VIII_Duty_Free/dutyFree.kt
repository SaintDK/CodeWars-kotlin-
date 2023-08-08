package kuy_8.Holiday_VIII_Duty_Free

fun dutyFree(normPrice: Int, discount:Int, hol:Int): Int {

    val answer = hol * 100 / (normPrice * discount)

    return answer
}

//fun dutyFree(normPrice: Int, discount:Int, hol:Int) = hol * 100 / (normPrice * discount)