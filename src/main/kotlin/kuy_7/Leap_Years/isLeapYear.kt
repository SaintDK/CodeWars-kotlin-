package kuy_7.Leap_Years

fun isLeapYear(year: Int) = java.time.Year.of(year).isLeap

//fun isLeapYear(year: Int): Boolean {
//    when {
//        year % 400 == 0 -> return true
//        year % 100 == 0 -> return false
//        else -> return year % 4 == 0
//    }
//}
