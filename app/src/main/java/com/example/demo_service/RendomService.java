package com.example.demo_service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RendomService extends Service {
    public RendomService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}