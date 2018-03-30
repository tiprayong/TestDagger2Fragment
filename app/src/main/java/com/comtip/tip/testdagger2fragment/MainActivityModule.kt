package com.comtip.tip.testdagger2fragment

import com.comtip.tip.testdagger2fragment.Data.ApiService
import com.comtip.tip.testdagger2fragment.Presenter.MainContract
import com.comtip.tip.testdagger2fragment.Presenter.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by TipRayong on 29/3/2561 14:31
 * TestDagger2Fragment
 */
@Module
class MainActivityModule {

    @Provides
    fun provideMainView(mainActivity: MainActivity):MainContract.View = mainActivity

    @Provides
    fun mainPresenter(view:MainContract.View,api:ApiService):MainContract.UserActionListener {
        return  MainPresenter(view,api)
    }


}

