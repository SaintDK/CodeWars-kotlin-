package kuy_8.Grasshopper_Terminal_game_move_function

//fun move(pos: Int, roll: Int): Int = roll*2+pos
fun move(x: Int, y: Int): Int {
    return if (x < y) (y - x) else (x - y)
}