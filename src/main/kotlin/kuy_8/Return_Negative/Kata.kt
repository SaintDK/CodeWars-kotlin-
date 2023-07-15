package kuy_8.Return_Negative
import kotlin.math.absoluteValue

class Kata {
    fun makeNegative(x: Int): Int = -x.absoluteValue
}

//class Kata {
//
//    fun makeNegative(x: Int) = if(x <= 0) x else -x
//}

//class Kata {
//
//    fun makeNegative(x: Int): Int {
//        return -Math.abs(x)
//    }
//}