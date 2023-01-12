package kuy_7.Mumbling

fun accum(s:String):String = s.mapIndexed { index, char -> char.toUpperCase() + char.toString().toLowerCase().repeat(index) }.joinToString("-")