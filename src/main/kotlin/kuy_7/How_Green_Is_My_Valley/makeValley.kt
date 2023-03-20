package kuy_7.How_Green_Is_My_Valley

import java.util.Arrays

fun makeValley(arr: IntArray) = arr.sortedDescending().chunked(2)
    .let { it.map { it[0] } + it.mapNotNull { it.getOrNull(1) }.reversed() }.toIntArray()