package kuy_7.Easy_Line

fun choose(n: Int, k: Int): BigInteger = when {
    n == 0 -> 0.toBigInteger()
    k == 0 -> 1.toBigInteger()
    else -> choose(n - 1, k - 1) * n.toBigInteger() / k.toBigInteger()
}

fun easyLine(n:Int):BigInteger = choose(2 * n, n)