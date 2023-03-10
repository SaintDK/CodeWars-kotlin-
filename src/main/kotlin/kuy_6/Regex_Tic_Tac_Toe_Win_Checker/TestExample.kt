package kuy_6.Regex_Tic_Tac_Toe_Win_Checker

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun someBoardsWithWinnersTests () {
        val winners = arrayOf("XXX-O-O-O", "X--OOOX-X", "O--OO-XXX", "O-XOX-O-X", "OXOOXOXX-", "X-O-OOXXO", "XO--X-OOX", "X-OXOOOXX")
        winners.forEach { winner ->
            println("Testing with board " + winner)
            assertEquals(true, winChecker(winner))
        }
    }

    @Test
    fun someBoardsWithoutWinnersTests () {
        val notWinners = arrayOf("XO-------", "XX-XOO---", "-XX-OO-O-", "OXO--XXO-", "OOXXXO---", "OXXX-XOO-", "OOXXX----", "XXOOXXOO-", "OXOXOX---")
        notWinners.forEach { notWinner ->
            println("Testing with board " + notWinner)
            assertEquals(false, winChecker(notWinner))
        }
    }

}
