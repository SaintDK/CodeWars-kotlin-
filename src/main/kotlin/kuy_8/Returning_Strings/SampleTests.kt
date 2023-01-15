package kuy_8.Returning_Strings

import junit.framework.Assert.assertEquals
import org.junit.Test

class SampleTests {
    @Test
    fun `Basic tests`() {
        assertEquals(greet("Ryan"), "Hello, Ryan how are you doing today?")
        assertEquals(greet("Shingles"), "Hello, Shingles how are you doing today?")
    }
}
