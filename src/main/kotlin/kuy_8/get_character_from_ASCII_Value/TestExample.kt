package kuy_8.get_character_from_ASCII_Value

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("67", numberToString(67))
        assertEquals("123", numberToString(123))
        assertEquals("999", numberToString(999))
    }
}