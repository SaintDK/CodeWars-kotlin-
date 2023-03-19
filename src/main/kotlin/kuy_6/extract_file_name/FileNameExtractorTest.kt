package kuy_6.extract_file_name

import org.junit.Test
import org.junit.Assert.assertEquals

class FileNameExtractorTest {
    @Test
    fun testSample() {
        assertEquals(
            "FILE_NAME.EXTENSION",
            FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        )
        assertEquals(
            "FILE_NAME.EXTENSION",
            FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        )
    }
}
