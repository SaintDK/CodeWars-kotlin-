package kuy_6.Braking_well

import org.junit.Assert.*
import java.text.DecimalFormat
import org.junit.Test

class BrakingTest {
    @Test
    fun test1() {
        println("Fixed Tests: dist")
        assertFuzzyEquals(dist(144.0, 0.3), 311.83146449201496)
        assertFuzzyEquals(dist(92.0, 0.5), 92.12909477605366)

    }
    @Test
    fun test2() {
        println("Fixed Tests: speed")
        assertFuzzyEquals(speed(159.0, 0.8), 153.79671564846308)
        assertFuzzyEquals(speed(164.0, 0.7), 147.91115701756493)

    }

    companion object {
        private fun randInt(min:Int, max:Int):Int {
            return min + (Math.random() * ((max - min) + 1)).toInt()
        }
        private fun assertFuzzyEquals(act:Double, exp:Double) {
            val inrange = Math.abs(act - exp) <= 1e-2
            if (inrange == false)
            {
                val df = DecimalFormat("#.00")
                println("At 1e-2: Expected must be " + df.format(exp) + ", but got " + df.format(act))
            }
            assertEquals(true, inrange)
        }
    }
}