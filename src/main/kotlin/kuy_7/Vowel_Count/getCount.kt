package kuy_7.Vowel_Count

fun getCount(str : String) : Int {
    val vowels = "aeiou"
    return str.count { it in vowels }
}
