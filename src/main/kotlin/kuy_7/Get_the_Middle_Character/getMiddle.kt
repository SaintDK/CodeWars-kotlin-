package kuy_7.Get_the_Middle_Character



fun getMiddle(word : String) : String {
    val len = word.length
    return word.substring (len / 2 - (len + 1) % 2, len / 2 + 1)
}

//fun getMiddle(word : String) : String {
//    if (word.length % 2 != 0) {return word[word.length / 2].toString() }
//    return word[word.length / 2 - 1].toString() + word[word.length / 2 ].toString()
//}