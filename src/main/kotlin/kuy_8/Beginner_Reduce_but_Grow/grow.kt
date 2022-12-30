package kuy_8.Beginner_Reduce_but_Grow

fun grow(arr: IntArray): Int {
    return arr.reduce {a, b -> a * b}
}