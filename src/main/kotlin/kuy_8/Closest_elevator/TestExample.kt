package kuy_8.Closest_elevator

import junit.framework.Assert.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("left", elevator(0,1,0))
        assertEquals("right", elevator(0,1,1))
        assertEquals("right", elevator(0,1,2))
        assertEquals("right", elevator(0,0,0))
        assertEquals("right", elevator(0,2,1))
    }
}