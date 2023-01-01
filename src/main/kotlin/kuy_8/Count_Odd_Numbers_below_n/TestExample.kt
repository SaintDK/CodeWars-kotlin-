package kuy_8.Count_Odd_Numbers_below_n

import junit.framework.Assert.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals(7, oddCount(15))
        assertEquals(7511, oddCount(15023))
    }
}