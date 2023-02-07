package kuy_7.All_Inclusive

fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
    return arr.containsAll(List(strng.length) { (strng.drop(it) + strng.take(it)) })
}