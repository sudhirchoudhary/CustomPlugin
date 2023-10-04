package com.example.customplugin

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.mylibrary.logd

class MyService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        logd("onStartCommand")
        return START_STICKY
    }

    override fun onCreate() {
        logd("onCreate")
        super.onCreate()
    }

    override fun onDestroy() {
        logd("onDestroy")
        super.onDestroy()
    }
}