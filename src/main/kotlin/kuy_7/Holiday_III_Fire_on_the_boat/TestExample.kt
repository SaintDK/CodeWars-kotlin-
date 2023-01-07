package kuy_7.Holiday_III_Fire_on_the_boat

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("Boat Rudder Mast Boat Hull Water ~~ Boat Deck Hull ~~ Propeller Deck ~~ Deck Boat Mast", fireFight("Boat Rudder Mast Boat Hull Water Fire Boat Deck Hull Fire Propeller Deck Fire Deck Boat Mast"))
        assertEquals("Mast Deck Engine Water ~~", fireFight("Mast Deck Engine Water Fire"))
        assertEquals("~~ Deck Engine Sail Deck ~~ ~~ ~~ Rudder ~~ Boat ~~ ~~ Captain", fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"))
    }
}