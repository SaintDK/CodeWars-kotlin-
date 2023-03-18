package kuy_7.Leap_Years

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic Tests`() {
        assertEquals(false, isLeapYear(1234))
        assertEquals(true, isLeapYear(1984))
        assertEquals(true, isLeapYear(2000))
        assertEquals(false, isLeapYear(2010))
        assertEquals(false, isLeapYear(2013))
    }
}
