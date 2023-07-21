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