package kuy_7.Looking_for_a_benefactor

fun newAvg(a:DoubleArray, navg:Double):Long {
    return Math.ceil(navg * (a.size + 1) - a.sum()).toLong().takeIf { it > 0 } ?: throw IllegalArgumentException()
}