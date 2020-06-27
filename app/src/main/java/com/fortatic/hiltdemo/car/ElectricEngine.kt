package com.fortatic.hiltdemo.car

import timber.log.Timber
import javax.inject.Inject

class ElectricEngine @Inject constructor() : Engine {

    init {
        start()
    }

    override fun start() {
        Timber.d("Start electric engine!")
    }
}