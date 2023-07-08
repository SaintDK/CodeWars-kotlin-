package kuy_8.Twice_as_old

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    val diff = dadYearsOld - (sonYearsOld * 2)
    return Math.abs(diff)
}

//fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int = Math.abs(dadYearsOld - (sonYearsOld * 2))