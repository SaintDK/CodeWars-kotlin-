package kuy_7.Double_Sort

object DoubleSort {
    fun dbSort(a: Array<Any>): Array<Any> = (a.filterIsInstance<Int>().sortedBy { it } + a.filterIsInstance<String>().sorted()).toTypedArray()
}