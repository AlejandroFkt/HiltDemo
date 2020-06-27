package com.fortatic.hiltdemo.car

import timber.log.Timber

class Car constructor(
    private val engine: Engine,
    private val wheels: Wheels
) {
    fun drive(){
        Timber.d("Driving...")
    }
}