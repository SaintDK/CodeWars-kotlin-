package kuy_8.Circular_List

class CircularList<T>(vararg val elements: T) {
    var i = -1
    init {
        if(elements.size == 0) throw Exception()
    }
    fun next(): T {
        i = (i + 1) % elements.size
        return elements[i]
    }
    fun prev(): T {
        i = ( if(i < 1) elements.size else i ) - 1
        return elements[i]
    }
}