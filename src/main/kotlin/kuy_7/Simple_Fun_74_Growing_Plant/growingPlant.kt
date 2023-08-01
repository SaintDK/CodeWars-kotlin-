package kuy_7.Simple_Fun_74_Growing_Plant

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int{
    var height = 0
    var days = 0
    while (true){
        height += upSpeed
        days++
        if (height >= desiredHeight) return days
        height -= downSpeed
    }
}

//fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int) =
//    kotlin.math.ceil(((desiredHeight - downSpeed).toDouble() / (upSpeed - downSpeed))).toInt().coerceAtLeast(1)