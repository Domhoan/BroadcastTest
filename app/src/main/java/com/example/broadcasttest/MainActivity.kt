package com.example.broadcasttest

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var broadcast: Broadcast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        broadcast = Broadcast()
        val filter1 = IntentFilter("android.intent.action.AIRPLANE_MODE")
        val filter2 = IntentFilter("android.intent.action.")
        registerReceiver(broadcast,filter1)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(broadcast)
    }
}