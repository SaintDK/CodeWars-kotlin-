package kuy_7.Maximum_Multiple

fun maxMultiple(d: Int, b: Int): Int = (b downTo d).first { it % d == 0 }

//fun maxMultiple(d: Int, b: Int) = b / d * d

//fun maxMultiple(d: Int, b: Int) = b-(b%d)

//fun maxMultiple(divisor: Int, bound: Int): Int = (bound downTo 0).first { it % divisor == 0 }

