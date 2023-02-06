package kuy_7.Growth_of_a_Population

fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int =
    generateSequence(pp0.toDouble()) { it * (1 + percent / 100) + aug }.takeWhile { it < p }.count()