package kuy_7.Easy_wallpaper

fun wallpaper(l:Double, w:Double, h:Double):String {
    val textNumbers = arrayOf<String>("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty")
    if (h * w * l == 0.0) return "zero"
    val rolls = Math.ceil((((l + w) * 2.0 * h / 0.52 / 10.0) * 1.15)).toInt()
    return textNumbers[rolls]
}