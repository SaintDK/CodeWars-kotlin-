package kuy_6.Computing_the_complex_logarithm_function

fun log(complex: DoubleArray): DoubleArray {
    val x = complex[0]; val y = complex[1]
    if (x==0.0 && y==0.0) throw ArithmeticException("")
    return doubleArrayOf(Math.log(Math.hypot(x, y)), Math.atan2(y, x))
}