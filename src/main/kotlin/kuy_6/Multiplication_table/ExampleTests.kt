package kuy_6.Multiplication_table

import junit.framework.TestCase.assertTrue
import org.junit.Test

class ExampleTests {
    private fun Array<IntArray>.stringify(): String = "[\n" + Array(this.size,{ "  [ " + this[it].map { n -> n.toString() }.joinToString(", ") + " ]" }).joinToString("\n") + "\n]"

    @Test fun `Basic Test`() {
        val size = 3
        val user = KataSolution.multiplicationTable(size)

        val sol = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(2,4,6),
            intArrayOf(3,6,9)
        )

        assertTrue(user.contentDeepEquals(sol), "Expected:\n${sol.stringify()}\nGot:\n${user.stringify()}")
    }
}