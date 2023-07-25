package kuy_8.Reversed_sequence

fun reverseSeq(n: Int): List<Int> {
    return (n downTo 1).toList()
}

//fun reverseSeq(n: Int) = List(n) { n  - it }