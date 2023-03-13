package kuy_7.Printer_Errors

fun printerError(s: String): String {
    val errors = s.count { it !in 'a'..'m' }
    val length = s.length
    return "$errors/$length"
}