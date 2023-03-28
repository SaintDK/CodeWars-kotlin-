package kuy_6.A_floating_point_system

import java.math.BigDecimal
import java.math.RoundingMode

fun mantExp(number: BigDecimal, nDigits: Int): String {
    val n = number.setScale(nDigits + number.scale() - number.precision(), RoundingMode.DOWN)
    return "${n.unscaledValue()}P${-n.scale()}"
}