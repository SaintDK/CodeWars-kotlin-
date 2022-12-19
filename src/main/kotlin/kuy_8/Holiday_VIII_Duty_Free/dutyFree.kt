package kuy_8.Holiday_VIII_Duty_Free

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals(166, dutyFree(12, 50, 1000))
        assertEquals(294, dutyFree(17, 10, 500))
        assertEquals(357, dutyFree(24, 35, 3000))
        assertEquals(60, dutyFree(377, 40, 9048))
        assertEquals(10, dutyFree(2479, 51, 13390))
    }
}
