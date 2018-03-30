package com.comtip.tip.testdagger2fragment.Fragment

/**
 * Created by TipRayong on 29/3/2561 14:07
 * TestDagger2Fragment
 */
interface DetailFragmentContract {

    interface View {
        fun showDetail()
    }

    interface UserActionListener{
        fun loadData()
    }
}

