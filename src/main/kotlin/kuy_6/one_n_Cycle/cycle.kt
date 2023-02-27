package kuy_6.one_n_Cycle

fun cycle(n: Int): Int {
    if (n % 2 == 0 || n % 5 == 0) return -1
    return generateSequence(10) { i -> (i % n * 10).takeUnless { it == 10 } }.count()
}