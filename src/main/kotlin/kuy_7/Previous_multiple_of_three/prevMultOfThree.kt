package kuy_7.Previous_multiple_of_three

fun prevMultOfThree(n: Int): Int? = when{
    n == 0 -> null
    n % 3 == 0 -> n
    else -> prevMultOfThree(n / 10)
}