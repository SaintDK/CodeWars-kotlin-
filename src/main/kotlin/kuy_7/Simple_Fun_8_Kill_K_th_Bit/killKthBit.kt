package kuy_7.Simple_Fun_8_Kill_K_th_Bit

fun killKthBit(n: Int, k: Int): Int {
    return n and (1 shl k - 1).inv()
}

