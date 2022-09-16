package kuy_7.Sum_of_angles

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestKata {
    @Test
    fun basicTests() {
        assertEquals(180, angle(3))
        assertEquals(360, angle(4))
    }
}