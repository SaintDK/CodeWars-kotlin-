package kuy_7.Rotate_for_a_Max

fun maxRot(n:Long):Long {
    var str = n.toString()
    var x: Long = n
    for (i in str.indices) {
        str = StringBuilder(str + str[i]).deleteCharAt(i).toString()
        x = maxOf(x, str.toLong())
    }
    return x
}