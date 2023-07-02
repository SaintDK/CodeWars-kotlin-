package kuy_7.Encode_data_on_CD_Compac_Disc_surface

import junit.framework.TestCase.assertEquals

import org.junit.Test

class TestSample {
    @Test
    fun `should test sample cases`() {
        assertEquals("PLLPPPPPP", encodeCd(5u))
        assertEquals("PPPPPLLLL", encodeCd(16u))
        assertEquals("PLPLPLPPP", encodeCd(63u))
        assertEquals("PPLPLPPLP", encodeCd(222u))
    }
}
