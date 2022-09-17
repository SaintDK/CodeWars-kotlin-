package kuy_7.Complementary_DNA

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun test01() {
        assertEquals("TTTT", makeComplement("AAAA"));
    }
    @Test
    fun test02() {
        assertEquals("TAACG", makeComplement("ATTGC"));
    }

}