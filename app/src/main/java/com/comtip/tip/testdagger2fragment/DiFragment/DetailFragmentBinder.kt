package com.comtip.tip.testdagger2fragment.DiFragment

import com.comtip.tip.testdagger2fragment.Fragment.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by TipRayong on 29/3/2561 14:46
 * TestDagger2Fragment
 */
@Module
abstract class DetailFragmentBinder {
    @ContributesAndroidInjector(modules = arrayOf(DetailFragmentModule::class))
    abstract fun bindDetailFragment():DetailFragment
}


