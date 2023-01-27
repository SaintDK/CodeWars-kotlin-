package kuy_7.Word_values

object Solution {
    fun nameValue(arr: Array<String>) = arr.mapIndexed { i, s -> s.replace(" ", "").sumBy { it.toInt() - 96 } * (i + 1) }.toIntArray()
}