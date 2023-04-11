package kuy_7.Simple_Fun_41_Elections_Winners

fun electionsWinners(votes: Array<Int>, k: Int) = votes.max()!!.run {
    if (k == 0 && votes.count{ it == this} == 1) 1
    else votes.count{ it + k > this }
}