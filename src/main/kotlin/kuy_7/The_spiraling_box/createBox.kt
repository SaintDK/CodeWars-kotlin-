package kuy_7.The_spiraling_box

fun createBox(width: Int, length: Int): Array<IntArray> =
    Array(length) { i -> IntArray(width) { j -> intArrayOf(i + 1, j + 1, width - j, length - i).minOrNull() ?: 0 } }

