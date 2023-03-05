package kuy_6.Buying_a_car

import kotlin.math.roundToInt

object BuyCar {
    fun nbMonths(
        startPriceOld: Int,
        startPriceNew: Int,
        savingperMonth: Int,
        percentLossByMonth: Double
    ): Pair<Int, Int> {
        var month = 0
        var decreaseRate: Double = 1 - (percentLossByMonth / 100)
        var newPriceOld: Double = startPriceOld.toDouble()
        var newPriceNew: Double = startPriceNew.toDouble()

        while (month * savingperMonth + newPriceOld < newPriceNew){
            month++
            if (month % 2 == 0) decreaseRate -= 0.005
            newPriceOld *= decreaseRate
            newPriceNew *= decreaseRate
        }

        return Pair(month, (month * savingperMonth + newPriceOld - newPriceNew).roundToInt())

    }
}