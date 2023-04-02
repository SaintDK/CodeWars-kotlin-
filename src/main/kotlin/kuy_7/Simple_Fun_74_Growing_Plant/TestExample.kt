package kuy_7.Simple_Fun_74_Growing_Plant

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(10, growingPlant(100,10,910))
        assertEquals(1, growingPlant(10,9,4))
    }
}