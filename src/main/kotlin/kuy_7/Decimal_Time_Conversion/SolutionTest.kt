package kuy_7.Decimal_Time_Conversion

import junit.framework.TestCase.assertEquals
import org.junit.Test

class SolutionTest {
    @Test
    fun basicTests() {
        assertEquals(0.02,toIndustrial(1));
        assertEquals(0.03,toIndustrial(2));
        assertEquals(1.75,toIndustrial(105));
        assertEquals(0.05,toIndustrial("0:03"));
        assertEquals(0.07,toIndustrial("0:04"));
        assertEquals(1.75,toIndustrial("1:45"));
        assertEquals("1:45",toNormal(1.75));
        assertEquals("0:20",toNormal(0.33));
    }
}