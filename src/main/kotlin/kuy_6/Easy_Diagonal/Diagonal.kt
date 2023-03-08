package kuy_6.Easy_Diagonal

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {
        fun IntRange.product() = fold(BigInteger.ONE) { acc, i -> acc * i.toBigInteger() }
        return (n - p + 1..n + 1).product() / (1..p + 1).product()
    }
}