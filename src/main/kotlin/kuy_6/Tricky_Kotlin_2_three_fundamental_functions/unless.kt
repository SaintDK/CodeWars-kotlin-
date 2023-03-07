package kuy_6.Tricky_Kotlin_2_three_fundamental_functions

fun unless(condition: Boolean, action: () -> Unit) { if(!condition) action() }
fun until(condition:()->Boolean, action: () -> Unit) { while(!condition()) action() }
fun forceRun(forcedAction:()->Unit) { try { forcedAction() } catch (e: Exception) {} }