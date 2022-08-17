package kuy_8.Remove_First_and_Last_Character

fun removeChar(str: String): String {
    return str.dropLast(1).removeRange(0.rangeTo(0))
}