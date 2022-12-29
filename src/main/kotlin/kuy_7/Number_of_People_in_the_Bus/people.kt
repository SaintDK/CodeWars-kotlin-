package kuy_7.Number_of_People_in_the_Bus

fun people(busStops: Array<Pair<Int, Int>>) = busStops.sumBy { it.first - it.second }
