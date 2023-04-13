package kuy_6.Multiples_of_3_or_5

fun solution(n: Int): Int {
    var t = (n - 1)/3  //3
    var f = (n - 1)/5  //1
    var ft = (n - 1)/15  //0

    return (3*t*(t+1) + 5*f*(f+1) - 15*ft*(ft+1))/2
}