package kuy_8.Beginner_Lost_Without_a_Map

fun maps(x: IntArray): IntArray {
    return x.map { it * 2 }.toIntArray()
}