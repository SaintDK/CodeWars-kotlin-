package kuy_7.Clean_up_after_your_dog

fun crap(x: Array<CharArray>, bags: Int, cap: Int): String {
    val craps = x.joinToString("") { it.joinToString("") }.takeIf { !it.contains("D") }?.count { it == '@' } ?: return "Dog!!"
    return if (craps <= bags * cap) "Clean" else "Cr@p"
}