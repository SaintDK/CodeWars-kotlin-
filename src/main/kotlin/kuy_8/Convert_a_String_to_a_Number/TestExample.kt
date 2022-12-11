package kuy_8.Convert_a_String_to_a_Number

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun sampleTests() {
        assertEquals(1234, stringToNumber("1234"))
        assertEquals(605, stringToNumber("605"))
        assertEquals(1405, stringToNumber("1405"))
        assertEquals(-7, stringToNumber("-7"))
    }
}