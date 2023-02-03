package kuy_7.Alphabetical_Sequence

fun alphaSeq(str: String) = str.toLowerCase().toCharArray().sorted().joinToString(",") { it.toString().repeat(it.toInt() - 96).capitalize() }