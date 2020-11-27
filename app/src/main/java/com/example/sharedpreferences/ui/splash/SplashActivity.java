package com.example.sharedpreferences.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.sharedpreferences.R;
import com.example.sharedpreferences.data.sharedPref.SharedPrefManager;
import com.example.sharedpreferences.ui.HomeActivity;
import com.example.sharedpreferences.ui.auth.LoginActivity;
import com.example.sharedpreferences.ui.profile.ProfileActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Handler handler = new Handler();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final SharedPrefManager sharedPrefManager = new SharedPrefManager(this);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sharedPrefManager.getIsLogin()){
                    Intent i = new Intent(SplashActivity.this, ProfileActivity.class);
                    finishAffinity();
                    startActivity(i);
                }else{
                    Intent i = new Intent(SplashActivity.this, HomeActivity.class);
                    finishAffinity();
                    startActivity(i);
                }
            }
        }, 3000);

    }
}