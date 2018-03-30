package com.comtip.tip.testdagger2fragment.DiApp

import android.app.Application
import com.comtip.tip.testdagger2fragment.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by TipRayong on 29/3/2561 14:53
 * TestDagger2Fragment
 */

@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBinder::class
))
interface AppComponent {
    fun inject(app: MainApplication)
    @Component.Builder
    interface Builder : ComponentBuilder<AppComponent> {
        @BindsInstance
        fun application(application: Application): Builder
    }
}

interface ComponentBuilder<out component> {
    fun build(): component
}

