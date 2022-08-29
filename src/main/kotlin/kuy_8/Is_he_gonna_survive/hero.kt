package kuy_8.Is_he_gonna_survive

fun hero(bullets: Int, dragons: Int) : Boolean {
    if (bullets >= dragons * 2){return true}
    return false;
}