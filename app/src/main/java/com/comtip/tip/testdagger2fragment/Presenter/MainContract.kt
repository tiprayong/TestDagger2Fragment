package com.comtip.tip.testdagger2fragment.Presenter

/**
 * Created by TipRayong on 29/3/2561 14:32
 * TestDagger2Fragment
 */
interface MainContract {
    interface View{
        fun showLoading()
    }

    interface UserActionListener{
        fun refresh()
    }
}

