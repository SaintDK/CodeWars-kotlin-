package kuy_7.Simple_Fun_20_First_Reverse_Try

fun firstReverseTry(arr: IntArray) : IntArray {
    if(arr.isNotEmpty()) {
        val temp = arr[0]
        arr[0] = arr[arr.size - 1]
        arr[arr.size - 1] = temp
    }

    return arr
}