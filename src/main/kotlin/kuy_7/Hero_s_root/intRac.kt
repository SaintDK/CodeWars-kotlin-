package kuy_7.Hero_s_root

fun intRac(n:Long, guess:Long):Long {
    
    val newGuess = (n / guess + guess) / 2
    
    if( newGuess == guess ) return(1)
    
    return intRac(n, newGuess)+1
}
//fun intRac(n: Long, guess: Long): Long {
//    val newGuess = (guess + n / guess) / 2
//
//    return if (guess == newGuess) 1 else intRac(n, newGuess) + 1
//}

//fun intRac(n:Long, guess:Long) = ((guess + n / guess) / 2).run {
//    generateSequence(guess to this){it.second to (it.second + n/ it.second) / 2 }
//        .takeWhile{ it.first != it.second}
//        .count() + 1L
//}