package com.mobitz.firebaseauthentication;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by
 * Dilipkumar R. Kaklotar
 * [ Senior Android Developer ]
 * Mobile: +91 8000722607
 * Skype: dilipkaklotar
 * Created On 05/05/18.
 */
public class Mobitz extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
