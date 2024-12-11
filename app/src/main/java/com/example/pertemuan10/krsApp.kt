package com.example.pertemuan10

import android.app.Application
import com.example.pertemuan10.dependenciesinjection.ContainerApp

class KrsApp: Application() {

    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        //Membuat interface container app

        containerApp = ContainerApp(this)
        //Instance adalah object yang dibuat dari class
    }

}