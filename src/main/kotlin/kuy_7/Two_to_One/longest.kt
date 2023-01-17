package kuy_7.Two_to_One

fun longest(s1:String, s2:String):String {
    return (s1 + s2).toSortedSet().joinToString("")
}