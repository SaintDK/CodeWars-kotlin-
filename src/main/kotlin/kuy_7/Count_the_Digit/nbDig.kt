package kuy_7.Count_the_Digit

fun nbDig(n: Int, d: Int): Int = (0..n).joinToString { "${it * it}" }.count { "$it" == "$d" }