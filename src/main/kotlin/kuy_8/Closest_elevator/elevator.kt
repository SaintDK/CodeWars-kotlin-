package kuy_8.Closest_elevator

import kotlin.math.abs
fun elevator(left: Int, right: Int, call: Int) = if (abs(call - left) < abs(call - right)) "left" else "right"