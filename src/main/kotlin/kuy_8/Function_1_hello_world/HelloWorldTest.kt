package kuy_8.Function_1_hello_world

import org.junit.Test
import org.junit.Assert.assertEquals
class HelloWorldTest {
    @Test
    @Throws(Exception::class)
    fun testHelloWorld() {
        assertEquals("hello world!", greet())
    }
}