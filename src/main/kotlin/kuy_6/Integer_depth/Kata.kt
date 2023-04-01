package kuy_6.Integer_depth

object Kata {
    fun computeDepth(n: Int): Int {
        var times = 1
        val hset = hashSetOf<Char>()
        do{
            for(i in (n*times).toString()){
                hset.add(i)
                if(hset.size == 10 ) return times
            }
            times ++
        }while(true)
    }
}