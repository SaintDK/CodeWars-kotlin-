package kuy_7.Alphabet_war

fun alphabetWar(fight: String): String {

    var team1 = 0
    var team2 = 0

    for(char in fight.toCharArray()){

        if (char == 'm') { team2 += 4 }
        if (char == 'q') { team2 += 3 }
        if (char == 'd') { team2 += 2 }
        if (char == 'z') { team2 += 1 }

        if (char == 'w') { team1 += 4 }
        if (char == 'p') { team1 += 3 }
        if (char == 'b') { team1 += 2 }
        if (char == 's') { team1 += 1 }
    }

    if (team1 < team2) { return "Right side wins!" }
    if (team1 > team2) { return "Left side wins!" }

    return "Let's fight again!"
}