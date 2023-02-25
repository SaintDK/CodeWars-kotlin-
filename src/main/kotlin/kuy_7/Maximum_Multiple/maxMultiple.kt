package kuy_7.Maximum_Multiple

fun maxMultiple(d: Int, b: Int): Int = (b downTo d).first { it % d == 0 }
