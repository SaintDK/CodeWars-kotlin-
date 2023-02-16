package kuy_7.A_Rule_of_Divisibility_by_7

fun seven(n: Long, i: Long = 0): LongArray =
    if (n > 99) seven(n / 10 - n % 10 * 2, i + 1)
    else longArrayOf(n, i)