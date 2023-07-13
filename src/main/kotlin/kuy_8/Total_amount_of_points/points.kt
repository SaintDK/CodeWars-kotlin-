package kuy_8.Total_amount_of_points

fun points(games: List<String>) = games.sumBy {
    when {
        it[0] > it[2] -> 3
        it[0] == it[2] -> 1
        else -> 0
    }
}

//fun points(games: List<String>) = games.sumBy {
//    val x = it[0]; val y = it[2]; if (x > y) 3 else if (x == y) 1 else 0
//}

//fun points(games: List<String>): Int =
//    games.map {
//        if(it.first().digitToInt() > it.last().digitToInt())
//        { 3 }
//        else if(it.first().digitToInt() == it.last().digitToInt()) { 1 } else { 0 } }.sum()