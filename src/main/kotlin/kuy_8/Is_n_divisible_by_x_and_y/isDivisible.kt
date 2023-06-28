package kuy_8.Is_n_divisible_by_x_and_y

fun isDivisible(n: Int, x: Int, y: Int): Any {
    if (n % x <= 0 && n % y <= 0) {return true}
    return false
}