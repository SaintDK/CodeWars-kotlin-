package kuy_8.Holiday_VIII_Duty_Free

fun dutyFree(normPrice: Int, discount:Int, hol:Int): Int {
//    val answer = hol / (normPrice * discount/100)
    val answer = hol * 100 / (normPrice * discount)

    return answer
}