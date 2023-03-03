package kuy_6.Encrypt_this

fun encryptThis(text:String): String{
    return text.split(" ").map { it.first().toInt().toString() + it.drop(2).takeLast(1) + it.drop(2).dropLast(1) + it.drop(1).take(1) }.joinToString(" ")
}