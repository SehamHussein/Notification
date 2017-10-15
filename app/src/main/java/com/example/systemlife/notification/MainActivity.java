package com.example.systemlife.notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OneSignal.idsAvailable(new OneSignal.IdsAvailableHandler() {
            @Override
            public void idsAvailable(String userId, String registrationId) {
                Log.d("seham", "idsAvailable: "+userId);
            }
        });
    }
}
//https://onesignal.com/apps/7ce8b92d-16e6-4520-aaec-f7b5d3283173/notifications/new
//https://console.firebase.google.com/project/onesignalexamble-ce5fa/settings/cloudmessaging/
