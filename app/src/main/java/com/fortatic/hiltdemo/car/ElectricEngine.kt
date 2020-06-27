package com.fortatic.hiltdemo.car

import timber.log.Timber

class ElectricEngine: Engine {

    init {
        start()
    }

    override fun start() {
        Timber.d("Start electric engine!")
    }
}