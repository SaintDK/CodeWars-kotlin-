package kuy_8.Find_the_smallest_integer_in_the_array

import junit.framework.TestCase.assertEquals
import org.junit.Test

class Test {

    @Test
    fun exampleTests() {
        val sif: SmallestIntegerFinder = SmallestIntegerFinder()
        assertEquals(10, sif.findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
    }

}