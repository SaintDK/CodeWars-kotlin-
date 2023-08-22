package kuy_7.Log_without_dates

fun checkLogs(log: Array<String>): Int =
    log.size - log.asSequence().zipWithNext{ x, y -> x < y }.count{ it }

//fun checkLogs(log: Array<String>): Int =
//    log.toList().zipWithNext().count {(a, b) -> b <= a} + (if (log.size == 0) 0 else 1)

//fun checkLogs(log: Array<String>): Int {
//    var c = 0
//    if (log.size > 0) c++
//    val x = List(log.size) { log[it].split(":").joinToString("").toInt() }
//    for (a in 1..x.size - 1) {
//        if (x[a] <= x[a - 1]) c++
//    }
//    return c
//}

//fun checkLogs(log: Array<String>): Int {
//    var prev = "99:99:99"
//    var days = 0
//    log.forEach {
//        if (it <= prev) days++
//        prev = it
//    }
//    return days
//}