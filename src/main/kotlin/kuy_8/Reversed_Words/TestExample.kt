package kuy_8.Reversed_Words

// You can test using JUnit or KotlinTest. JUnit is shown below
// TODO: replace this example test with your own, this is just here to demonstrate usage.

// TODO: replace with whatever your package is called

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun sample() {
        assertEquals("eating like I",Reverse.reverseWords("I like eating") )
        assertEquals("flying like I", Reverse.reverseWords("I like flying"))
        assertEquals("nice is world The", Reverse.reverseWords("The world is nice"))
        assertEquals("it!! Split Just", Reverse.reverseWords("Just Split it!!"))
        assertEquals("!!! !! !", Reverse.reverseWords("! !! !!!"))
        assertEquals("7777 777 77 7", Reverse.reverseWords("7 77 777 7777"))
        assertEquals("D : Jpazzy", Reverse.reverseWords("Jpazzy : D"))
    }
}