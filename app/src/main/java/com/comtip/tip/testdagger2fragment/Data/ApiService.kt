package com.comtip.tip.testdagger2fragment.Data

import java.util.*

/**
 * Created by TipRayong on 29/3/2561 14:10
 * TestDagger2Fragment
 */
interface ApiService {
    fun loadData()
    fun loadHeader()
}

class ApiServiceImpl : ApiService {

    override fun loadHeader() {
        val h = Random().nextInt(4)
        when(h){
            0 -> headerDagger = "Zero"
            1 -> headerDagger = "First"
            2 -> headerDagger = "Second"
            else -> headerDagger = "Third"
        }
    }

    override fun loadData() {
        dataDagger = "Fragment Data\n"
        var r = 99
        for (i in 1..7) {
           val temp:Int = Random().nextInt(r)
            r = temp+1
            dataDagger += "[ Loop $i get $temp ]\n"
        }

    }

}


