package kuy_6.Color_Choice


import org.junit.Assert.*
import org.junit.Test

class CheckchooseTest {

    @Test
    fun BasicTests() {
        println("****** Basic Tests ******")
        assertEquals(2, checkchoose(6, 4))
        assertEquals(1, checkchoose(4, 4))
        assertEquals(3, checkchoose(35, 7))

    }

}