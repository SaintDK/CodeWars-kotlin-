package kuy_7.Maximum_Multiple

fun maxMultiple(d: Int, b: Int): Int = (b downTo d).first { it % d == 0 }

//fun maxMultiple(d: Int, b: Int) = b / d * d

//fun maxMultiple(d: Int, b: Int) = b-(b%d)

//fun maxMultiple(divisor: Int, bound: Int): Int = (bound downTo 0).first { it % divisor == 0 }

//fun maxMultiple(d: Int, b: Int): Int {
//    var max = 0
//    for (n in b downTo 1 ) {
//        if (n % d == 0 ) {
//            max = n
//            break
//        }
//    }
//    return max
//}

//fun maxMultiple(d: Int, b: Int): Int =
//    (b.toFloat() - b.toFloat().mod(d.toFloat())).toInt()

//fun maxMultiple(d: Int, b: Int): Int? = (1..b).filter{it%d == 0 }.maxOrNull()

//tailrec fun maxMultiple(d: Int, b: Int): Int =
//    if (b % d == 0) b else maxMultiple(d,b-1)