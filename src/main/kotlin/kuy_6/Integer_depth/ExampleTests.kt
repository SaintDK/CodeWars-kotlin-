package kuy_6.Integer_depth


import junit.framework.TestCase.assertEquals
import org.junit.Test

class ExampleTests {
    fun runTest(n: Int, sol: Int) = assertEquals(sol,Kata.computeDepth(n))

    @Test fun `Sample tests`() {
        runTest(1, 10)
        runTest(42, 9)
        runTest(25, 36)
    }
}