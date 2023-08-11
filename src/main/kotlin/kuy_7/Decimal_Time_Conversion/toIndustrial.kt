package kuy_7.Decimal_Time_Conversion

fun toIndustrial(t: Int): Double = Math.round(t / 60.0 * 100) / 100.0

fun toIndustrial(t: String): Double = t.split(':').fold(0) { r, x -> r * 60 + x.toInt() }.let { toIndustrial(it) }

fun toNormal(t: Double): String {
    val time = Math.round(t * 60)
    return "%d:%02d".format(time / 60, time % 60)
}