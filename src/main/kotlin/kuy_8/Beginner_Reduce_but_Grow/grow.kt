package kuy_8.Beginner_Reduce_but_Grow

//fun grow(arr: IntArray): Int {
//    return arr.reduce {a, b -> a * b}
//}

fun grow(arr: IntArray): Int = arr.reduce { a, b -> a * b }

//    var result = 1
//    arr.forEach {result *= it}
//    return result
//}