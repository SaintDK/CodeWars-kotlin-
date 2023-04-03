package kuy_7.The_Baum_Sweet_sequence

fun baumSweet(): Iterator<Int> = iterator {
    yield(1)
    yieldAll(generateSequence(1) { it + 1 }.map { it.toString(2).split("1").none { it.length % 2 != 0 }.compareTo(false) })
}