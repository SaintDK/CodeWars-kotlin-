package kuy_7.Simple_Fun_7_Will_You

fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean =
    (young && beautiful && !loved) ||(loved && (!young || !beautiful))