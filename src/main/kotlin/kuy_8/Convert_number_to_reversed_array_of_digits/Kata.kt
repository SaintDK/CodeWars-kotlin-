package kuy_8.Convert_number_to_reversed_array_of_digits

object Kata {
    fun digitize(n:Long):IntArray {
        return n.toString().map(Character::getNumericValue).toIntArray().reversedArray()
    }
}

//object Kata {
//    fun digitize(n: Long) = "$n".reversed().map { "$it".toInt() }.toIntArray()
//}