package kuy_6.Tricky_Kotlin_0_extension_constructor

operator fun kotlin.Int.Companion.invoke(s: String): Int = s.toInt()
operator fun kotlin.Long.Companion.invoke(s: String): Long = s.toLong()
operator fun kotlin.Double.Companion.invoke(s: String): Double = s.toDouble()