package com.fortatic.hiltdemo.car

import javax.inject.Inject

class Wheels @Inject constructor(
    private val tires: Tires,
    private val rims: Rims
)