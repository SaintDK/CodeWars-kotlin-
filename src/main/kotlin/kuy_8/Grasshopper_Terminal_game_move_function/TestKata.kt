package kuy_8.Grasshopper_Terminal_game_move_function

import junit.framework.Assert.assertEquals
import org.junit.Test

class TestKata {
    @Test
    fun basicTests() {
        assertEquals(8, move(0, 4))
        assertEquals(15, move(3, 6))
        assertEquals(12, move(2, 5))
    }
}