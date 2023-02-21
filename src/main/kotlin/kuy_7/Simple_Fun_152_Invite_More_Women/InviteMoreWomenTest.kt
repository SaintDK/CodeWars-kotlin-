package kuy_7.Simple_Fun_152_Invite_More_Women

import junit.framework.Assert.assertEquals
import org.junit.Test

class InviteMoreWomenTest {
    @Test
    fun basicTests() {
        assertEquals(true, inviteMoreWomen(listOf(1, -1, 1)))
        assertEquals(false, inviteMoreWomen(listOf(-1, -1, -1)))
        assertEquals(false, inviteMoreWomen(listOf(1, -1)))
        assertEquals(true, inviteMoreWomen(listOf(1, 1, 1)))
    }
}