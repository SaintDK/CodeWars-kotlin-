package kuy_7.How_many_arguments

import junit.framework.TestCase.assertEquals
import org.junit.Test

class ExampleTest {
    @Test
    fun basicTests() {
        assertEquals(1, argsCount(100))
        assertEquals(3, argsCount(100, 2, 3))
        assertEquals(2, argsCount(32, 12))
        assertEquals(0, argsCount())
        assertEquals(1, argsCount("a string!"))
    }
    @Test
    fun anyTypeTest() {
        assertEquals(2, argsCount("a string!", Pair(1, "2")))
    }
}