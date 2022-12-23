package kuy_8.Opposites_Attract

import org.junit.Assert.*
import org.junit.Test
import java.util.*


class OppositesAttractTests {

    @Test
    fun exampleTests() {
        assertTrue(loveFun(1, 4))
        assertFalse(loveFun(2, 2))
        assertTrue(loveFun(0, 1))
        assertFalse(loveFun(0, 0))
    }
}
