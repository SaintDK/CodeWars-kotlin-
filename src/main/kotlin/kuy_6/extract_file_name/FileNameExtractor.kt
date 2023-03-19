package kuy_6.extract_file_name

object FileNameExtractor {
    fun extractFileName(self:String)=self.substringAfter("_").substringBeforeLast(".")
}