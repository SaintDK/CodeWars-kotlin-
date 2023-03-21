package kuy_7.Plus_minus_plus_plus_Count

fun catchSignChange(arr: Array<Int>): Int = arr.map { it < 0 }.zipWithNext { a, b -> a != b }.count { it }