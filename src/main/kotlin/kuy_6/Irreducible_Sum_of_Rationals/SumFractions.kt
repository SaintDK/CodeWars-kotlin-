package kuy_6.Irreducible_Sum_of_Rationals

import kotlin.math.min

object SumFractions {

    fun sumFracts(l: Array<IntArray>): String {
        if (l.isEmpty()) return ""
        val maxDenominator = l.fold(1) { acc: Int, ints: IntArray -> acc * ints[1] }
        var denominator = 1
        for (factor in 1..maxDenominator) {
            if (l.all { factor % it[1] == 0 }) {
                denominator *= factor
                break
            }
        }
        var nominator = l.fold(0) { acc: Int, ints: IntArray -> acc + ints[0]*denominator/ints[1] }
        if (nominator%denominator == 0) return "${nominator/denominator}"


        for (value in  min(nominator, denominator) downTo 1)  {
            if (nominator % value == 0 && denominator % value == 0) {
                nominator /= value
                denominator /= value
                break
            }
        }
        return "[$nominator, $denominator]"

    }
}