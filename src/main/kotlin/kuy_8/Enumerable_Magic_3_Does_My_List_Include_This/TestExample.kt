package kuy_8.Enumerable_Magic_3_Does_My_List_Include_This

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic Tests`() {
        assertEquals(true, include(intArrayOf(1,2,3,4), 2))
        assertEquals(false, include(intArrayOf(1,2,4,5), 3))
    }
}