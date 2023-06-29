package kuy_8.Sum_Mixed_Array
public class MixedSum {
    fun sum(list: List<Any>): Int {
        return list.sumOf { (it as? String)?.toIntOrNull() ?: it as? Int ?: 0 }
    }
}