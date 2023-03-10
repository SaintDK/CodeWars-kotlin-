package kuy_6.Regex_Tic_Tac_Toe_Win_Checker

fun winChecker(board : String) : Boolean {
    return Regex("(\\w)(..(\\1|.\\1.)..\\1|.\\1.\\1..$|\\1\\1(...)*$)").find(board) != null
}