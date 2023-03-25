package kuy_6.Disease_Spread

fun epidemic(tm: Int, n: Int, s0: Int, i0: Int, b: Double, a: Double): Int {
    val dt = tm.toDouble() / n
    var s = s0.toDouble()
    var i = i0.toDouble()
    repeat(n) {
        val ds = dt * b * s * i
        val dr = dt * a * i
        if (dr > ds) return i.toInt()
        s -= ds
        i = i + ds - dr
    }
    return 0
}