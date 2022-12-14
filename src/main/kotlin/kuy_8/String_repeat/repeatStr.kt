package kuy_8.String_repeat

fun repeatStr(r: Int, str: String): String {

    var answer = ""

    repeat(r){answer = answer + str}

    return answer
}