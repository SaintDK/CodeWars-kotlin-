package kuy_7.Encode_data_on_CD_Compac_Disc_surface


fun encodeCd(n: UByte): String {
    var result = "P"
    n.toString(2).padStart(8,'0').reversed().forEach{
        if (it == '1') {
            if(result.takeLast(1) == "P") result += "L" else result += "P"
        } else {
            if (result.takeLast(1) == "P") result += "P" else result += "L"
        }
    }
    return result
}