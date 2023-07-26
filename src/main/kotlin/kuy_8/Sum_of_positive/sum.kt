package kuy_8.Sum_of_positive

fun sum(numbers: IntArray): Int {
    var sum = 0
    for (i in numbers) { if (i > 0) {sum += i} }
    return sum
}