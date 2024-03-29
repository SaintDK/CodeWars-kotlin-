package kuy_7.Drying_Potatoes

import org.junit.Assert.*
import org.junit.Test
import java.util.Random

class PotatoesTest {
    @Test
    fun test() {
        dotest(82, 127, 80, 114)
        dotest(93, 129, 91, 100)
        dotest(82, 134, 77, 104)

    }
    companion object {
        private fun dotest(p0:Int, w0:Int, p1:Int, expected:Int) {
            assertEquals(expected, potatoes(p0, w0, p1))
        }
    }
}