package kuy_7.Going_to_the_cinema

import kotlin.math.pow
import kotlin.math.ceil

fun movie(card:Int, ticket:Int, perc:Double) = generateSequence(1){it + 1}.
first {
    ticket * it > ceil(card + ticket * perc * (1 - perc.pow(it)) / (1 - perc))
}