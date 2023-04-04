package kuy_7.Pandemia

fun infected(s: String) = s.split("X")
    .sumOf { if (it.contains('1')) it.length.toDouble() else 0.0 }
    .let { it * 100.0 / (s.count { c -> c != 'X' }.takeIf { c -> c != 0 } ?: 1) }