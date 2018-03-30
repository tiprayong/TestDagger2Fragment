package com.comtip.tip.testdagger2fragment.Presenter

import com.comtip.tip.testdagger2fragment.Data.ApiService

/**
 * Created by TipRayong on 29/3/2561 14:34
 * TestDagger2Fragment
 */
class MainPresenter (val view:MainContract.View,val api: ApiService)
    :MainContract.UserActionListener{
    override fun refresh() {
        api.loadHeader()
        view.showLoading()
    }
}
