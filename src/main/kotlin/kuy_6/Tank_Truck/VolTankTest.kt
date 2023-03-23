package kuy_6.Tank_Truck


import org.junit.Assert.*
import org.junit.Test

class VolTankTest {
    @Test
    fun test0() {
        println("Fixed Tests")
        assertEquals(2940, tankVol(5, 7, 3848))
        assertEquals(245, tankVol(1, 4, 1256))
    }

}