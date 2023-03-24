package kuy_6.Change_your_Points_of_View

typealias Point<T> = ((Int, Int) -> T) -> T

object PointView {
    fun <T> point(a: Int, b: Int): Point<T> = fun(f: (Int, Int) -> T) = f(a, b)
    fun fst(pt: Point<Int>) = pt { a, _ -> a }
    fun snd(pt: Point<Int>) = pt { _, b -> b }
    fun sqrDist(pt1: Point<Int>, pt2: Point<Int>) = pt1 { x, y -> pt2 { u, v -> (x - u) * (x - u) + (y - v) * (y - v) } }
    fun line(pt1: Point<IntArray>, pt2: Point<IntArray>) = pt1 { x, y -> pt2 { u, v -> val dx = u - x; val dy = v - y; intArrayOf(-dy, dx, dy * x - dx * y) } }
}
