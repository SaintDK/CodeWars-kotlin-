package kuy_7.Decimal_Time_Conversion

fun toIndustrial(t: Int): Double = Math.round(t / 60.0 * 100) / 100.0

fun toIndustrial(t: String): Double = t.split(':').fold(0) { r, x -> r * 60 + x.toInt() }.let { toIndustrial(it) }

fun toNormal(t: Double): String {
    val time = Math.round(t * 60)
    return "%d:%02d".format(time / 60, time % 60)
}


//fun toIndustrial(t: Int): Double = (t * 100 / 60.0).roundToInt() / 100.0
//
//
//fun toIndustrial(t: String): Double{
//    val time = t.split(":").map { it.toInt() }.let { it.first() * 60 + it.last() }
//    return toIndustrial(time)
//}
//
//fun toNormal(t: Double): String{
//    val time = (t * 100 * 0.6).roundToInt()
//    return "${time / 60}:${String.format("%02d", time % 60)}"
//}