package kuy_7.The_Office_I_Outed

fun outed(meet: Map<String, Int>, boss: String): String {
    val avg = meet.asIterable().sumBy { if(it.key == boss) it.value*2 else it.value } / meet.size
    return if (avg <= 5) "Get Out Now!" else "Nice Work Champ!"
}