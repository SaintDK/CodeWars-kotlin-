package kuy_8.Remove_First_and_Last_Character

import junit.framework.TestCase.assertEquals
import org.junit.Test

class ExampleTests {
    @Test
    fun basicTests() {
        assertEquals("loquen", removeChar("eloquent"))
        assertEquals("ountr", removeChar("country"))
        assertEquals("erso", removeChar("person"))
        assertEquals("lac", removeChar("place"))
    }
}