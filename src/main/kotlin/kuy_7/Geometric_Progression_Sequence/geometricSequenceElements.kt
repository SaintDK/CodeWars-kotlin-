package kuy_7.Geometric_Progression_Sequence

fun geometricSequenceElements(a: Int, r: Int, n: Int): String =
    generateSequence(a) { it * r }
        .take(n)
        .joinToString(", ")