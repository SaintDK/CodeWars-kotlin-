package kuy_8.Alternate_capitalization

fun capitalize(text: String) = listOf(
    text.mapIndexed { index, string -> if(index % 2 == 0 )string.toUpperCase() else string }.joinToString(""),
    text.mapIndexed { index, string -> if(index % 2 == 0 )string else string.toUpperCase() }.joinToString("")
)