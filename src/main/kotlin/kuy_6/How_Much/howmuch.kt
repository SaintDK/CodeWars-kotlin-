package kuy_6.How_Much

fun howmuch(m:Int, n:Int):String {
    var i = Math.min(m, n)
    val j = Math.max(m, n)
    var res = "["
    while (i <= j)
    {
        if ((i % 9 == 1) && (i % 7 == 2))
        {
            res += "[M: " + i + " B: " + (i / 7).toInt() + " C: " + (i / 9).toInt() + "]"
        }
        i++
    }
    return res + "]"
}