package kuy_7.List_of_all_Rationals

fun allRationals(): Iterator<Pair<Int, Int>> = iterator {
    yield(Pair(1, 1))
    for ((a, b) in allRationals()) {
        yield(Pair(a, a + b))
        yield(Pair(a + b, b))
    }
}