package kuy_8.Is_he_gonna_survive

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(true, hero(10, 5))
        assertEquals(false, hero(7, 4))
        assertEquals(false, hero(4, 5))
        assertEquals(true , hero(100, 40))
        assertEquals(false, hero(1500, 751))
        assertEquals(false, hero(0, 1))
    }
}