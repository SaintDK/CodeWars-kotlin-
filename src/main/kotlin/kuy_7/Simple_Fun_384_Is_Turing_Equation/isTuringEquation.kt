package kuy_7.Simple_Fun_384_Is_Turing_Equation

fun isTuringEquation(s: String): Boolean =
    s.split('+', '=').map { it.reversed().toInt() }.let { it[0] + it[1] == it[2] }