package kuy_7.Two_to_One

import org.junit.Assert.*
import org.junit.Test

class TwoToOneTest {
    @Test
    fun test() {
        println("longest Fixed Tests")
        assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"))
        assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
        assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"))

    }

}