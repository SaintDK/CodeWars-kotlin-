package kuy_6.Multiples_of_3_or_5

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}