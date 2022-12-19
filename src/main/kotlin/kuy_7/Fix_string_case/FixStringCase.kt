package kuy_7.Fix_string_case

object FixStringCase {

    fun solve(s: String): String{
        if (s.count { it.isUpperCase() } > s.length / 2) return s.toUpperCase()
        else return s.toLowerCase()
    }
}