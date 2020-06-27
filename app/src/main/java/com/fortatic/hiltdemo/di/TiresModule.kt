package com.fortatic.hiltdemo.di

import com.fortatic.hiltdemo.car.Tires
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object TiresModule {

    @Provides
    fun provideTires() = Tires()
}