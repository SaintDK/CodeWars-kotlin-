package kuy_7.London_CityHacker

fun londonCityHacker(journey: Array<Any>): String {

    if (journey.isEmpty()) return "£0.00"

    val price = journey
        .map {
            if (it is String) "2.40" else "1.50"
        }
        .joinToString()
        .replace("1.50, 1.50", "1.50")
        .split(",")
        .sumOf { it -> it.toDouble() }


    return "£%.2f".format(price)
}