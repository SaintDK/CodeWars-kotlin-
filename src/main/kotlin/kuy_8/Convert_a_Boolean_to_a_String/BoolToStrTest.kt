package kuy_8.Convert_a_Boolean_to_a_String

import junit.framework.TestCase.assertEquals
import org.junit.Test

class BoolToStrTest {
    @Test
    fun testTrue() {
        assertEquals("true", convert(true))
    }

    @Test
    fun testFalse() {
        assertEquals("false", convert(false))
    }
}
