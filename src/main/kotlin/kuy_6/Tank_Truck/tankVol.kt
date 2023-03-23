package kuy_6.Tank_Truck

import kotlin.math.*

fun tankVol(h:Int, d:Int, vt:Int):Int {
    val r = d.toDouble() / 2

    val angle = 2 * acos(1 - h.toDouble() / r)

    val s = 0.5 * (angle - sin(angle)) / PI

    val v = floor(s * vt).toInt()
    return v
}