package kuy_8.Codewars_Leaderboard_Climber


object CodewarsLeaderboardClimber {
    fun leaderBoard(user: String, userScore: Int, yourScore: Int): String {
        val scoreNeeded = userScore - yourScore
        if (scoreNeeded < 0) return "Winning!"
        if (scoreNeeded == 0) return "Only need one!"
        val q = scoreNeeded / 3
        val r = scoreNeeded % 3
        return "To beat $user's score, I must complete $q Beta kata and $r 8kyu kata." + if (q + r > 1000) " Dammit!" else ""
    }
}