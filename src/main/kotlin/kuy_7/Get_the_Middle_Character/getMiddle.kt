package kuy_7.Get_the_Middle_Character

fun getMiddle(word : String) : String {
    val len = word.length
    return word.substring (len / 2 - (len + 1) % 2, len / 2 + 1)
}