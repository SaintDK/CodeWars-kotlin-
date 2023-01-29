package kuy_7.Target_Date

import java.time.LocalDate;

fun dateNbDays(a0:Double, a:Double, p:Double):String {
    return LocalDate.of(2016, 1, 1).plusDays(Math.ceil(Math.log(a / a0) / Math.log(1 + p / 36000)).toLong()).toString()
}