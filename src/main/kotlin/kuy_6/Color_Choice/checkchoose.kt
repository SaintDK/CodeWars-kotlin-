package kuy_6.Color_Choice

fun checkchoose(m:Long, n:Int):Long {
    var a=1L
    for(i in 1L..n/2) {
        a=a*(n-i+1)/i
        if(a==m) return i
    }
    return -1
}