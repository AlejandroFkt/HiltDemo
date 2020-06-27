package com.fortatic.hiltdemo.di

import com.fortatic.hiltdemo.car.ElectricEngine
import com.fortatic.hiltdemo.car.Engine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class EngineModule{

    @Binds
    abstract fun bindEngine(electricEngine: ElectricEngine) : Engine
}