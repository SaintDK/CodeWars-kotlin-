package kuy_6.`Reversing a Process`

fun decode(r: String): String {

    var pattern = "[^\\d+]".toRegex()
    var key = pattern.replace(r,"").toString().toInt()
    var code = r.replace(key.toString(),"")
    var result: String = ""

    code.forEach {
        var decodePos: Int = 0
        for (i in 0..25) {
            if (i * key % 26 == (it - 'a').toInt()) {
                result += (i+97).toChar()
                decodePos += 1
            }
        }
        if (decodePos != 1) return "no"
    }
    return result
}