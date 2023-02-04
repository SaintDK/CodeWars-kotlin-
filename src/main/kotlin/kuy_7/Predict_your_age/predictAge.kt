package kuy_7.Predict_your_age

fun predictAge(vararg age:Int) = (Math.sqrt((age.map{it*it}.sum().toDouble()))/2).toInt()