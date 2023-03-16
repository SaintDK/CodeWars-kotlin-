package kuy_6.Two_Sum

object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int,Int> {
        for(x in numbers.indices) {
            for (y in x + 1 until numbers.size) {
                val number1 = numbers[x]
                val number2 = numbers[y]
                if (number1 + number2 == target) {
                    return Pair(x, y)
                }
            }
        }
        throw Exception()
    }
}