package kuy_8.Beginner_Series_2_Clock

fun past(h: Int, m: Int, s: Int): Int {

    var hourToMilliSeconds = h * 3600000
    var minuteToMilliSeconds = m * 60000
    var secondsToMilliSeconds = s * 1000

    return (hourToMilliSeconds + minuteToMilliSeconds + secondsToMilliSeconds)
}