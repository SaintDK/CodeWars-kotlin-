package kuy_7.Shortest_Word

fun findShort(s: String): Int = s.split(" ").minOf{it.length}