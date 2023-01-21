package kuy_8.Count_of_positives_sum_of_negatives

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    if (input == null || input.isEmpty()) return emptyArray()
    val (positive, negative) = input.partition { it > 0 }
    return arrayOf(positive.count(), negative.sum())
}