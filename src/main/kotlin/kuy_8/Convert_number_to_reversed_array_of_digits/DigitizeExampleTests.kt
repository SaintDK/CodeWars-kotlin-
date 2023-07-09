package kuy_8.Convert_number_to_reversed_array_of_digits

import org.junit.Test
import org.junit.Assert.assertArrayEquals
class DigitizeExampleTests {
    @Test
    fun tests() {
        assertArrayEquals(intArrayOf(1, 3, 2, 5, 3), Kata.digitize(35231))
        assertArrayEquals(intArrayOf(0), Kata.digitize(0))
    }
}