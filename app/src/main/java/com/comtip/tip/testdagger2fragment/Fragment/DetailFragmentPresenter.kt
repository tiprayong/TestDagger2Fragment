package com.comtip.tip.testdagger2fragment.Fragment

import com.comtip.tip.testdagger2fragment.Data.ApiService

/**
 * Created by TipRayong on 29/3/2561 14:09
 * TestDagger2Fragment
 */
class DetailFragmentPresenter(val view:DetailFragmentContract.View
,val api:ApiService) :DetailFragmentContract.UserActionListener {
    override fun loadData() {
        api.loadData()
        view.showDetail()
    }
}


