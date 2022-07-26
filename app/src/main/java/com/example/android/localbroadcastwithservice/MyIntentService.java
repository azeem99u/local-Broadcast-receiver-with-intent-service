package com.example.android.localbroadcastwithservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;

import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("s");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        SystemClock.sleep(4000);
        Intent resultIntent = new Intent("DATA_SENDER");
        resultIntent.putExtra("message_key","task completed");
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(resultIntent);
    }
}