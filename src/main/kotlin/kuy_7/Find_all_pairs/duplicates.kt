package kuy_7.Find_all_pairs

fun duplicates(array: IntArray) = array.groupBy { it }.map { it.value.size / 2 }.sum()