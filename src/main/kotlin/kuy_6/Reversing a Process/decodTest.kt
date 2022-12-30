package kuy_6.`Reversing a Process`

import junit.framework.TestCase.assertEquals
import org.junit.Test

class decodTest {
    fun testingDecode(r: String, expected: String) {
        val actual: String = decode(r)
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        testingDecode("1273409kuqhkoynvvknsdwljantzkpnmfgf", "uogbucwnddunktsjfanzlurnyxmx")
        testingDecode("105860ymmgegeeiwaigsqkcaeguicc", "Impossible to decode")
        testingDecode("2460721mlptwabtlnnymizdkvfwlpwufhdsx", "evfpqajpvnnieurbmhtqvfqytlbgz")
        testingDecode("1877138eieaqgumigywmicwgcgg", "Impossible to decode")

    }
}
