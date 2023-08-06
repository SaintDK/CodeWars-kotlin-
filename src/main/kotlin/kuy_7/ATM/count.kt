package kuy_7.ATM


val values = listOf(500, 200, 100, 50, 20, 10)

fun count(amount: Int): Int {
    val (a, k) = values.fold(Pair(amount, 0)){ (a, k), v -> Pair(a % v, k + a / v) }
    return if (a == 0) k else -1
}

//fun count(number: Int):Int = when {
//    number % 10 != 0 -> -1
//    number - 500 >= 0 -> 1 + count(number - 500)
//    number - 200 >= 0 -> 1 + count(number - 200)
//    number - 100 >= 0 -> 1 + count(number - 100)
//    number - 50 >= 0 -> 1 + count(number - 50)
//    number - 20 >= 0 -> 1 + count(number - 20)
//    number - 10 >= 0 -> 1 + count(number - 10)
//    else -> 0
//}