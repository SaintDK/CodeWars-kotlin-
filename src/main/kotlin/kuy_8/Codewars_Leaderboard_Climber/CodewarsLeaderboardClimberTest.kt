package kuy_8.Codewars_Leaderboard_Climber

import org.junit.Test
import org.junit.Assert.*

class CodewarsLeaderboardClimberTest {
    @Test
    fun basicTests() {
        assertEquals("To beat g964's score, I must complete 5365 Beta kata and 2 8kyu kata. Dammit!", CodewarsLeaderboardClimber.leaderBoard("g964", 36097, 20000))
        assertEquals("To beat GiacomoSorbi's score, I must complete 15 Beta kata and 2 8kyu kata.", CodewarsLeaderboardClimber.leaderBoard("GiacomoSorbi", 23914, 23867))
        assertEquals("To beat ZozoFouchtra's score, I must complete 1330 Beta kata and 1 8kyu kata. Dammit!", CodewarsLeaderboardClimber.leaderBoard("ZozoFouchtra", 15991, 12000))
    }
}