package kuy_7.Steps_in_k_primes

import junit.framework.TestCase.assertEquals
import org.junit.Test

class KprimesstepsTest {
    fun listArrayLongToString(res:List<LongArray>):String {
        var s = "["
        val l = res.size
        for (i in 0 until l)
        {
            val a = res.get(i)
            s += "[" + a[0] + ", " + a[1]
            if (i < l - 1)
                s += "], "
            else
                s += "]"
        }
        s = s + "]"
        return s
    }
    fun testing(k:Int, step:Int, start:Long, nd:Long, expected:String) {
        val a = kprimesStep(k, step, start, nd)
        val actual = listArrayLongToString(a)
        assertEquals(expected, actual)
    }
    @Test
    fun BasicTest() {
        println("Basic Tests")
        testing(10, 8, 2425364, 2425700, "[]")
        testing(6, 8, 2627371, 2627581, "[[2627408, 2627416], [2627440, 2627448], [2627496, 2627504]]")

    }
}