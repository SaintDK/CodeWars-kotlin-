package kuy_7.ATM


val values = listOf(500, 200, 100, 50, 20, 10)

fun count(amount: Int): Int {
    val (a, k) = values.fold(Pair(amount, 0)){ (a, k), v -> Pair(a % v, k + a / v) }
    return if (a == 0) k else -1
}