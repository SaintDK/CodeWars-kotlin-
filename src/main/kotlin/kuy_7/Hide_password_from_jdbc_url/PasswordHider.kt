package kuy_7.Hide_password_from_jdbc_url

object PasswordHider {
    fun hidePasswordFromConnection(urlString: String)=
        with(urlString.substringAfter("password=").substringBefore("&")) {
            urlString.replace(this, this.map { '*' }.joinToString(""))
        }
}