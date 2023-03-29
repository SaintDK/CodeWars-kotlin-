package kuy_6.Braking_well


fun dist(v:Double, mu:Double):Double { // suppose reaction time is 1
    val g = 9.81 // acceleration due to gravity in m/s
    val coef = 1000 / 3600.0 // km/h -> m/s
    val dreact = v * coef // distance of reaction with t = 1
    val vms = coef * v // speed in m/s
    val dbrak = 0.5 * Math.pow(vms, 2.0) / mu / g // braking distance
    return dreact + dbrak
}
fun speed(d:Double, mu:Double):Double { // suppose reaction time is 1
    val g = 9.81 // acceleration due to gravity in m/s
    val coef = 3600 / 1000.0 // m/s -> km/h
    return 0.5 * mu * g * (-2 + Math.sqrt(4 + 8 * d / mu / g)) * coef
}