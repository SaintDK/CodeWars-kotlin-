package kuy_7.Even_numbers_in_an_array

fun evenNumbers(array: List<Int>, n: Int) = array.filter { it%2==0 }.takeLast(n)