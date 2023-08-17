package kuy_7.Log_without_dates

fun checkLogs(log: Array<String>): Int =
    log.size - log.asSequence().zipWithNext{ x, y -> x < y }.count{ it }

//fun checkLogs(log: Array<String>): Int =
//    log.toList().zipWithNext().count {(a, b) -> b <= a} + (if (log.size == 0) 0 else 1)