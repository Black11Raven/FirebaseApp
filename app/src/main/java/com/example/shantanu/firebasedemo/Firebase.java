package com.example.shantanu.firebasedemo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Shantanu on 16-06-2017.
 */

public class Firebase extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
       // Log.d("Firebase", "token "+ FirebaseInstanceId.getInstance().getToken());
        Log.i("Fais",token);
    }
}
