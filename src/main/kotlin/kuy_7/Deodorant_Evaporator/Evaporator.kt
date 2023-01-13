package kuy_7.Deodorant_Evaporator

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    var current = content
    var days = 0
    while (current > (content * threshold / 100.0)) {
        days++
        current-= (current * evap_per_day/100.0)
    }
    return days;
}