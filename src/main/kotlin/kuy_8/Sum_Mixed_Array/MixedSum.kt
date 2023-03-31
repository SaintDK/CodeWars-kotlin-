package kuy_8.Sum_Mixed_Array

public class MixedSum {

    fun sum(list: List<Any>): Int {
        var sum = 0
        for (item in list) {
            sum += when(item) {
                is Int -> item
                is String -> item.toInt()
                else -> 0
            }
        }
        return sum
    }
}