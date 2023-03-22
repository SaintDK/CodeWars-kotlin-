package kuy_6.Tricky_Kotlin_1_invoke_a_string

//import junit.framework.TestCase.assertEquals
//import org.junit.Test
//import java.io.File
//import java.util.*
//
//class KotlinTricks0 {
//    @Test
//    fun testString() {
//        assertEquals<String>("wow, I am the argument!", "this is a string, invoke it!"("wow, I am the argument!"))
//        assertEquals<String>("s", "this is a string, invoke it!"("s"))
//    }
//
//    @Test
//    fun testInt() {
//        val r = Random(System.currentTimeMillis())
//        (0..100).forEach { r.nextInt().let { assertEquals<Int>(it, "this is another string"(it)) } }
//    }
//
//    @Test
//    fun testLong() {
//        val r = Random(System.currentTimeMillis())
//        (0..100).forEach { r.nextLong().let { assertEquals<Long>(it, "oh come on!"(it)) } }
//    }
//
//    @Test
//    fun testFile() {
//        val r = Random(System.currentTimeMillis())
//        (0..100).forEach { r.nextLong().let { assertEquals<File>(File(it.toString()), "oh come on!"(File(it.toString()))) } }
//    }
//}
