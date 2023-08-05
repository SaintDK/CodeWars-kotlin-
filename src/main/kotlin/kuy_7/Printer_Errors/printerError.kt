package kuy_7.Printer_Errors

fun printerError(s: String): String {
    val errors = s.count { it !in 'a'..'m' }
    val length = s.length
    return "$errors/$length"
}

//fun printerError(s: String) = "${s.count { it !in 'a'..'m' }}/${s.length}"

//fun printerError(s: String): String {
//    val alphabet = arrayOf<Char>('n','o','p','q','r','s','t','u','v','w','x','y','z')
//    val left =  s.count { it in alphabet }
//    return "$left/${s.length}"
//}