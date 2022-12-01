package kuy_7.Highest_and_Lowest

fun highAndLow(numbers: String): String {
    val arrayNumbers = numbers.split(" ").map { e -> e.toInt()}.toIntArray()
    val max = arrayNumbers.maxOrNull()
    val min = arrayNumbers.minOrNull()
    return "$max $min"
}