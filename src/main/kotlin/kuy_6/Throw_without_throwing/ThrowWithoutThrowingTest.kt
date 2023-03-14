package kuy_6.Throw_without_throwing

import java.io.File
import java.nio.BufferOverflowException
import java.nio.file.Files
import java.util.*
import kotlin.reflect.KClass

///**
// * Created by ice1000 on 17-6-16.
// *
// * @author ice1000
// */
//class ThrowWithoutThrowingTest {
//
//    fun <T : Throwable> assertFailsWithExact(exceptionClass: KClass<T>, block: () -> Unit) {
//        assertEquals(exceptionClass, assertFailsWith(exceptionClass, block)::class)
//    }
//
//    @org.junit.Test
//    fun tests() {
//        assertFailsWithExact(ArithmeticException::class, ::arithmetic)
//        assertFailsWithExact(NoSuchElementException::class, ::noSuchElement)
//        assertFailsWithExact(ArrayIndexOutOfBoundsException::class, ::arrayIndexOutOfBound)
//        assertFailsWithExact(ClassCastException::class, ::classCast)
//        assertFailsWithExact(StackOverflowError::class, ::stackOverflow)
//        assertFailsWithExact(NullPointerException::class, ::nullPointer)
//        assertFailsWithExact(NumberFormatException::class, ::numberFormat)
//        assertFailsWithExact(IllegalArgumentException::class, ::illegalArgument)
//        assertFailsWithExact(NegativeArraySizeException::class, ::negativeArraySize)
//        assertFailsWithExact(EmptyStackException::class, ::emptyStack)
//        assertFailsWithExact(BufferOverflowException::class, ::bufferOverflow)
//        assertFailsWithExact(ArrayStoreException::class, ::arrayStore)
//        assertFailsWithExact(UnsupportedOperationException::class, ::unsupportedOperation)
//        assertFailsWithExact(IllegalStateException::class, ::illegalState)
//    }
//}