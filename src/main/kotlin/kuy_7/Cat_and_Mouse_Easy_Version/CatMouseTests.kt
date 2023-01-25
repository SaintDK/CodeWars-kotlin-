package kuy_7.Cat_and_Mouse_Easy_Version

import org.junit.Assert.assertEquals
import org.junit.Test

class CatMouseTests {

    @Test
    fun basicTests() {
        assertEquals("Escaped!", catMouse("C....m"))
        assertEquals("Caught!", catMouse("C..m"))
        assertEquals("Escaped!", catMouse("C.....m"))
        assertEquals("Caught!", catMouse("C.m"))
    }
}