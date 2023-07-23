package kuy_8.Never_visit_a

fun subtractSum(n: Int): String {
    var num = n
    var sum: Int
    var fruits = arrayOf(
        "kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple",
        "cucumber", "pineapple", "cucumber", "orange", "grape", "orange", "grape", "apple", "grape", "cherry",
        "pear", "cherry", "pear", "kiwi", "banana", "kiwi", "apple", "melon", "banana", "melon", "pineapple",
        "melon", "pineapple", "cucumber", "orange", "apple", "orange", "grape", "orange", "grape", "cherry",
        "pear", "cherry", "pear", "apple", "pear", "kiwi", "banana", "kiwi", "banana", "melon", "pineapple",
        "melon", "apple", "cucumber", "pineapple", "cucumber", "orange", "cucumber", "orange", "grape",
        "cherry", "apple", "cherry", "pear", "cherry", "pear", "kiwi", "pear", "kiwi", "banana", "apple",
        "banana", "melon", "pineapple", "melon", "pineapple", "cucumber", "pineapple", "cucumber", "apple",
        "grape", "orange", "grape", "cherry", "grape", "cherry", "pear", "cherry", "apple", "kiwi", "banana",
        "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple"
    )

    // Loop until the number is found in the fruit
    do {
        sum = getDigitSum(num)
        num -= sum
    } while (num !in fruits.indices)

    return fruits[num - 1]
}

fun getDigitSum(num: Int): Int {
    var n = num
    var sum = 0

    // Calculate the sum of digits
    while (n > 0) {
        sum += n % 10
        n /= 10
    }

    return sum
}