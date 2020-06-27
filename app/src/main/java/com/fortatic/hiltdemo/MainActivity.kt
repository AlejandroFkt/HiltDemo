package com.fortatic.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortatic.hiltdemo.car.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val tires = Tires()
        val rims = Rims()
        val wheels = Wheels(tires, rims)
        val car = Car(ElectricEngine(), wheels)

        car.drive()
    }
}