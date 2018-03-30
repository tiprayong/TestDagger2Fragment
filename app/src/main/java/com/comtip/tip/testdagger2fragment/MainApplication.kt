package com.comtip.tip.testdagger2fragment

import android.app.Activity
import android.app.Application
import com.comtip.tip.testdagger2fragment.DiApp.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by TipRayong on 29/3/2561 15:06
 * TestDagger2Fragment
 */
class MainApplication : Application(),HasActivityInjector {

    @Inject lateinit var dispatch:DispatchingAndroidInjector<Activity>
    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatch
    }

    override fun onCreate() {
        super.onCreate()
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
    }
}
