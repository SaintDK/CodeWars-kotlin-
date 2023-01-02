package kuy_7.Move_10

fun moveTen(s: String): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    return s.map { c -> alphabet[(alphabet.indexOf(c) + 10) % 26] }.joinToString("")
}