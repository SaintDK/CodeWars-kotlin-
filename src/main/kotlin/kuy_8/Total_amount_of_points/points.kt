package kuy_8.Total_amount_of_points

fun points(games: List<String>) = games.sumBy {
    when {
        it[0] > it[2] -> 3
        it[0] == it[2] -> 1
        else -> 0
    }
}