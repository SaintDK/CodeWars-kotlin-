package kuy_7.Speed_Control

fun gps(s: Int, x: DoubleArray) = x.toList()
    .windowed(2) { it[1] - it[0] }
    .map { 3600 * it / s }
    .max()
    ?.toInt() ?: 0