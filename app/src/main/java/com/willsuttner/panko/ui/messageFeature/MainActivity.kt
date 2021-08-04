package com.willsuttner.panko.ui.messageFeature

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.willsuttner.panko.APIClient
import com.willsuttner.panko.Reminder
import java.util.UUID

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        APIClient.dataPush(
            Reminder(
                id = 1,
                userName = UUID.randomUUID().toString(),
                userVerified = false
            )
        )
    }
}

