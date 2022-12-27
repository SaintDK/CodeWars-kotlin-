package kuy_6


fun mirror(text: String): String {
    val words = text.split(' ')
    val stars = "*".repeat(words.maxBy{ it.length }!!.length + 4)
    return words.joinToString("\n", "$stars\n", "\n$stars"){ "* ${it.reversed().padEnd(stars.length - 4)} *" }
}
