package kuy_7.Alphabetical_Addition

fun addLetters(arr: List<Char>): Char {

    val alphabet = "zabcdefghijklmnopqrstuvwxy"
    var sum = 0
    for (str in arr) sum += str - 'a' + 1
    return alphabet[sum % 26]


}

//fun addLetters(arr: List<Char>) = 'z' - arr.sumBy { 'z' - it } % 26