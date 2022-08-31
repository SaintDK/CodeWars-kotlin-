package kuy_8.Find_the_smallest_integer_in_the_array

class SmallestIntegerFinder {

    fun findSmallestInt(nums: List<Int>): Int {
        return nums.minOf { it }
    }

}