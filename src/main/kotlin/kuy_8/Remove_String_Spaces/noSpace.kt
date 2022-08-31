package kuy_8.Remove_String_Spaces

fun noSpace(x: String): String = x.filter { !it.isWhitespace() }