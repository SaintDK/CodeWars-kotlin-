package kuy_8.Simple_Fun_1_Seats_in_Theater

fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int {
    val x = nCols - col + 1
    val y = nRows - row

    return x * y
}