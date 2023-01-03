package kuy_8.Return_Negative

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MakeNegativeTest {

    private lateinit var kata: Kata

    @Before
    fun setUp() {
        kata = Kata()
    }

    @Test
    fun test1() {
        assertEquals(-42, kata.makeNegative(42).toLong())
        assertEquals(-42, kata.makeNegative(-42).toLong())
        assertEquals(0, kata.makeNegative(0).toLong())
    }
}