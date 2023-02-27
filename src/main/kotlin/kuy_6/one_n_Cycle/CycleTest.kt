package kuy_6.one_n_Cycle

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CycleTest {
    private fun dotest(n:Int, expected:Int) {
        val actual = cycle(n)
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun fixedTests() {
        dotest(3, 1)
        dotest(33, 2)
        dotest(18118, -1)

    }

}
