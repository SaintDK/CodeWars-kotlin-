package kuy_7.The_Baby_Years_I_Baby_Counting

fun babyCount(x: String): Int? {
    val a = minOf(
        x.toLowerCase().count { it == 'b' }/2,
        x.toLowerCase().count { it == 'a' },
        x.toLowerCase().count { it == 'y' }
    )
    return if(a == 0) null else a
}
