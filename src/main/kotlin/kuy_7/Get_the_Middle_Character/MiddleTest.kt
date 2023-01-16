package kuy_7.Get_the_Middle_Character

// You can test using JUnit or KotlinTest. JUnit is shown below
// TODO: replace this example test with your own, this is just here to demonstrate usage.

import junit.framework.Assert.assertEquals
import org.junit.Test
import java.util.Random

class MiddleTest {
    @Test
    fun basicTest() {
        assertEquals("es", getMiddle("test"));
        assertEquals("dd", getMiddle("middle"));
        assertEquals("t", getMiddle("testing"));
        assertEquals("A", getMiddle("A"));
    }

}