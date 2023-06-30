package kuy_8.Well_of_Ideas_Easy_Version

import junit.framework.TestCase
import org.junit.Test

fun well(x: Array<String>) =
    when (x.count { it == "good"}) {
        0 -> "Fail!"
        1,2 -> "Publish!"
        else -> "I smell a series!"
    }
