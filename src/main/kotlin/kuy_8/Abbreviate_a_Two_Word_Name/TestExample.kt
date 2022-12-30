package kuy_8.Abbreviate_a_Two_Word_Name

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("S.H", abbrevName("Sam Harris"));
        assertEquals("P.F", abbrevName("Patrick Feenan"));
        assertEquals("E.C", abbrevName("Evan Cole"));
        assertEquals("P.F", abbrevName("P Favuzzi"));
        assertEquals("D.M", abbrevName("David Mendieta"));
    }
}