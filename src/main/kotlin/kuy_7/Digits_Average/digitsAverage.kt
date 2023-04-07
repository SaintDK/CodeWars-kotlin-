package kuy_7.Digits_Average

fun digitsAverage(input: Int): Int {
    var digits = input.toString().map(Character::getNumericValue)
    while (digits.size > 1) {
        digits = digits.zipWithNext { a, b -> (a + b + 1) / 2 }
    }
    return digits.first()
}