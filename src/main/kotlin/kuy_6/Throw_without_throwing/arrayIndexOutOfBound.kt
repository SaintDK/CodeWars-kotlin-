package kuy_6.Throw_without_throwing

fun arrayIndexOutOfBound() = intArrayOf()[1]
fun negativeArraySize() = IntArray(-1)
fun noSuchElement() = intArrayOf().iterator().next()
fun arithmetic() = 1.div(0)
fun classCast() { val x = 0; x as String }
fun stackOverflow(): Int = stackOverflow()
fun nullPointer() { val x: Int? = null; x!!.div(1) }
fun numberFormat() = "ABC".toInt()
fun illegalArgument() = HashMap<Int, Int>(-1)
fun emptyStack() = java.util.Stack<Int>().pop()
fun bufferOverflow() = java.nio.IntBuffer.allocate(0).put(1)
fun arrayStore() = System.arraycopy(0, 0, 0, 0, 0)
fun unsupportedOperation() = java.util.Collections.unmodifiableList(listOf(0)).add(1)
fun illegalState() = java.util.ArrayList<Int>().iterator().remove()