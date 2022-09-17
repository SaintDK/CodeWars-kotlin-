package kuy_7.Complementary_DNA

fun makeComplement(dna : String) : String {
    return dna.map({
        when(it){
            'A' -> 'T'
            'T' -> 'A'
            'C' -> 'G'
            else -> 'C'
        }
    }).joinToString("");

}