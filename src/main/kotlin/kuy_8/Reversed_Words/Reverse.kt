package kuy_8.Reversed_Words

object Reverse{
    fun reverseWords(str:String): String {
        var X = arrayListOf<String>()
        X = ArrayList(str.split(" "))
        X.reverse()

        return X.joinToString(separator = " ")
    }
}