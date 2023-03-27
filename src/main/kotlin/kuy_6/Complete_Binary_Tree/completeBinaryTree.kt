package kuy_6.Complete_Binary_Tree

import java.lang.Math.*
import kotlin.math.pow


fun completeBinaryTree(input: IntArray):IntArray {
    if (input.size <= 1)
        return input

    val depth = ceil(log(input.size.toDouble() + 1, 2.0)).toInt()
    val min = 2.toDouble().pow(depth - 2).toInt() - 1
    val max = 2.toDouble().pow(depth - 1).toInt() - 1

    val left = min(max, input.size - 1 - min)

    val pivot = input[left]
    val leftTree = input.sliceArray(0..left-1)
    val rightTree = input.sliceArray(left+1..input.size-1)

    val result = intArrayOf(pivot) + merge(completeBinaryTree(leftTree), completeBinaryTree(rightTree), 1)
    return result
}

private fun merge(left: IntArray, right: IntArray, num: Int) : IntArray {
    return if (left.size <= num && right.size <= num)
        left + right
    else if (left.size > num && right.size <= num)
        left.sliceArray(0..num-1) + right + left.sliceArray(num..left.size-1)
    else
        left.sliceArray(0..num-1) + right.sliceArray(0..num-1) + merge(
            left.sliceArray(num..left.size-1), right.sliceArray(num..right.size-1), num*2)
}