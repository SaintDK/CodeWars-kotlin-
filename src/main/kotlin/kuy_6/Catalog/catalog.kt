package kuy_6.Catalog

fun catalog(s: String, article: String): String {
    val articles = s.split("\n")
        .filter { line -> line.substringAfter("<name>").substringBefore("</name>").contains(article) }
        .map {
            val name = it.substringAfter("<name>").substringBefore("</name>")
            val price = it.substringAfter("<prx>").substringBefore("</prx>")
            val qty = it.substringAfter("<qty>").substringBefore("</qty>")
            "$name > prx: \$$price qty: $qty"
        }
        .joinToString("\n")
    return if (articles.isBlank()) "Nothing"
    else articles
}