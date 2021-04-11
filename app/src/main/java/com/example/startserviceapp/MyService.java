package com.example.startserviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        Toast.makeText(this,"Service Started...",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service Destroyed...",Toast.LENGTH_LONG).show();
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
