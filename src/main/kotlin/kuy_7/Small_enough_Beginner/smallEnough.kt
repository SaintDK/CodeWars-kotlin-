package kuy_7.Small_enough_Beginner

fun smallEnough(a : IntArray, limit : Int): Boolean = a.all {it <= limit}