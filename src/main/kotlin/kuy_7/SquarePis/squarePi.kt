package kuy_7.SquarePis

fun squarePi(n: Int)="31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"
    .take(n).map{"$it".toDouble()}.map{it*it}.sum().let{Math.ceil(Math.sqrt(it)).toInt()}

