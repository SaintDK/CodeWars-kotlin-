package kuy_6.Multiplication_table

object KataSolution {
    fun multiplicationTable(size: Int) = Array(size) { x -> IntArray(size) { y -> (x + 1) * (y + 1) } }
}