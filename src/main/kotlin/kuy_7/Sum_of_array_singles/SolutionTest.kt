package kuy_7.Sum_of_array_singles

import junit.framework.TestCase.assertEquals
import org.junit.Test

class SolutionTest {
    @Test
    fun basicTests() {
        assertEquals(15, repeats(intArrayOf(4, 5, 7, 5, 4, 8)).toLong())
        assertEquals(19, repeats(intArrayOf(9, 10, 19, 13, 19, 13)).toLong())
        assertEquals(12, repeats(intArrayOf(16, 0, 11, 4, 8, 16, 0, 11)).toLong())
    }
}
