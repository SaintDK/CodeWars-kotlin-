package kuy_8.Abbreviate_a_Two_Word_Name

fun abbrevName(name:String): String {
    var first = name.substringBefore(' ').uppercase()
    var last = name.substringAfter(' ').uppercase()
    var initials = first[0] + "." + last[0]
    return initials
}