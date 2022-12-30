package kuy_6

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic Tests`() {
        assertEquals("*********\n* olleH *\n* dlroW *\n*********", mirror("Hello World"))
        assertEquals("************\n* srawedoC *\n************", mirror("Codewars"))
    }
}
