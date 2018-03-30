package com.comtip.tip.testdagger2fragment.DiApp

import com.comtip.tip.testdagger2fragment.DiFragment.DetailFragmentBinder
import com.comtip.tip.testdagger2fragment.MainActivity
import com.comtip.tip.testdagger2fragment.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by TipRayong on 29/3/2561 14:55
 * TestDagger2Fragment
 */
@Module
abstract  class ActivityBinder {
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class,DetailFragmentBinder::class))
    abstract fun bindMainActivity():MainActivity
}

