package kuy_8.get_ascii_value_of_character

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals(65, getAscii('A'))
        assertEquals(32, getAscii(' '))
        assertEquals(33, getAscii('!'))
    }
}