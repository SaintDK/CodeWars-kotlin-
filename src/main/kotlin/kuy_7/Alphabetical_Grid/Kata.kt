package kuy_7.Alphabetical_Grid

object Kata {
    fun grid(n: Int): String? =
        if (n < 0) null
        else (0 until n).joinToString("\n") { generateSequence { 'a'..'z' }.flatten().drop(it).take(n).joinToString(" ") }
}