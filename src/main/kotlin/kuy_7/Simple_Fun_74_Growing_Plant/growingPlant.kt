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

//fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
//
//    var count = 0;
//    var height = 0;
//
//    while (height < desiredHeight) {
//
//        height += upSpeed;
//        count++;
//
//        if (height >= desiredHeight) {
//            break;
//        }
//        else {
//            height -= downSpeed;
//        }
//
//
//    }
//
//
//    return count;
//}

//fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
//    val delta = upSpeed - downSpeed;
//    val fullCyclesNeeded = (desiredHeight + delta - 1)/delta;
//    val fullCyclesPlusOneDayNeeded = max(1, (desiredHeight - upSpeed + delta - 1)/delta + 1);
//
//    return min(fullCyclesNeeded, fullCyclesPlusOneDayNeeded);
//}