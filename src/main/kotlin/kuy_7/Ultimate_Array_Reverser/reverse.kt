package kuy_7.Ultimate_Array_Reverser

fun reverse(a: List<String>): List<String> {
    val str = a.joinToString("").reversed().iterator()
    return a.map { Array(it.length) { str.nextChar() }.joinToString("") }
}
