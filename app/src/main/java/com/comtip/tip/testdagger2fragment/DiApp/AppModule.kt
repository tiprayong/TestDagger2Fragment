package com.comtip.tip.testdagger2fragment.DiApp

import android.app.Application
import android.content.Context
import com.comtip.tip.testdagger2fragment.Data.ApiService
import com.comtip.tip.testdagger2fragment.Data.ApiServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by TipRayong on 29/3/2561 14:50
 * TestDagger2Fragment
 */

@Module
class AppModule {
    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideApiService():ApiService = ApiServiceImpl()

}
