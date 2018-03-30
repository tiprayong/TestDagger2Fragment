package com.comtip.tip.testdagger2fragment.DiFragment

import com.comtip.tip.testdagger2fragment.Data.ApiService
import com.comtip.tip.testdagger2fragment.Fragment.DetailFragment
import com.comtip.tip.testdagger2fragment.Fragment.DetailFragmentContract
import com.comtip.tip.testdagger2fragment.Fragment.DetailFragmentPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by TipRayong on 29/3/2561 14:24
 * TestDagger2Fragment
 */
@Module
class DetailFragmentModule {
@Provides
    fun provideView(fragment:DetailFragment):DetailFragmentContract.View = fragment

@Provides
    fun providePresenter(view:DetailFragmentContract.View,api:ApiService)
    :DetailFragmentContract.UserActionListener{
    return DetailFragmentPresenter(view,api)
}

}

