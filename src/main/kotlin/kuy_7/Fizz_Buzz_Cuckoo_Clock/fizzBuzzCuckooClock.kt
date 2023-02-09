package kuy_7.Fizz_Buzz_Cuckoo_Clock


fun fizzBuzzCuckooClock(time: String) : String {
    val minutes = time.substring(3..4).toInt()
    val hours = (time.substring(0..1).toInt() % 12).takeIf { it != 0 } ?: 12
    return when {
        minutes == 0 -> "Cuckoo ".repeat(hours).dropLast(1)
        minutes == 30 -> "Cuckoo"
        minutes % 15 == 0 -> "Fizz Buzz"
        minutes % 3 == 0 -> "Fizz"
        minutes % 5 == 0 -> "Buzz"
        else -> "tick"
    }
}