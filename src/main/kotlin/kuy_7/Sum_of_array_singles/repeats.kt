package kuy_7.Sum_of_array_singles

fun repeats(arr: IntArray): Int =
    2 * arr.distinct().sum() - arr.sum()