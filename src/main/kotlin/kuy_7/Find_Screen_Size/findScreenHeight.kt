package kuy_7.Find_Screen_Size

fun findScreenHeight(width: Int, ratio: String): String {
    val aspectRatio = ratio.split(":")
    val widthRatio = aspectRatio[0].toDouble()
    val heightRatio = aspectRatio[1].toDouble()
    val height = (width / (widthRatio / heightRatio)).toInt()
    return "${width}x$height"
}