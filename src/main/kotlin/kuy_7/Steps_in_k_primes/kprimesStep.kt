package kuy_7.Steps_in_k_primes

fun kprimesStep(k:Int, step:Int, start:Long, nd:Long):List<LongArray> {
    var arr : List<LongArray> = listOf()
    var i = start;
    while (i <= nd - step) {
        if (primeFactorCount(i) == k.toLong() && primeFactorCount(i + step) == k.toLong()) {
            arr += (longArrayOf(i, i + step));
        }
        i = i + 1;
    }
    return arr;
}

fun primeFactorCount(m:Long): Long {
    var len = 0.toLong();
    var n = m;
    var i = 2.toLong();
    while (i * i <= n) {
        while (n % i == 0.toLong()) {
            len = len + 1;
            n = n / i;
        }
        i = i + 1;
    }
    if (n > 1) len = len + 1;
    return len;
}