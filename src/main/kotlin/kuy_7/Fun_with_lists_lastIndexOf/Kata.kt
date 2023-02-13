package kuy_7.Fun_with_lists_lastIndexOf

import org.w3c.dom.Node

object Kata {
    fun lastIndexOf(head: Node?, value: Any): Int {
        return lastIndexRecursive(0, -1, value, head)
    }

    fun lastIndexRecursive(currentIndex: Int, lastOccurrence: Int, value: Any, head: Node?): Int = when {
        head == null -> lastOccurrence
        head.data == value -> lastIndexRecursive(currentIndex+1, currentIndex, value, head.next)
        else -> lastIndexRecursive(currentIndex+1, lastOccurrence, value, head.next)
    }
}