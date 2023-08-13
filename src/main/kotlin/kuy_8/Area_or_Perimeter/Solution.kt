package kuy_8.Area_or_Perimeter

object Solution {
    fun areaOrPerimeter(l: Int, w: Int): Int {
        return if (l == w) {
            l * l // area of square
        } else {
            2 * l + 2 * w // perimeter of rectangle
        }
    }
}