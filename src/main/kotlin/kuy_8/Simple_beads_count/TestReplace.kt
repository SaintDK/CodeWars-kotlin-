package kuy_8.Simple_beads_count

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.util.Random

class TestReplace {

    @Test
    fun testFixed() {
        assertEquals(0, countRedBeads(0));
        assertEquals(0, countRedBeads(1));
        assertEquals(4, countRedBeads(3));
        assertEquals(8, countRedBeads(5));
    }

}