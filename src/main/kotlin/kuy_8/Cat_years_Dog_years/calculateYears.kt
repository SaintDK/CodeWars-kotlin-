package kuy_8.Cat_years_Dog_years

fun calculateYears(years: Int): Array<Int> =
    if (years == 1) arrayOf(1, 15, 15) else arrayOf(years, 16 + 4 * years, 14 + 5 * years)