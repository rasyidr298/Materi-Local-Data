package com.example.sharedpreferences.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sharedpreferences.R;
import com.example.sharedpreferences.ui.auth.LoginActivity;
import com.example.sharedpreferences.ui.roomData.RoomDataActivity;
import com.example.sharedpreferences.ui.sharedPref.SharedPrefActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnToShared =  findViewById(R.id.btnToSharedPref);
        Button btnToRoom =  findViewById(R.id.btnToRoomData);
        Button btnLogin =  findViewById(R.id.btnLogin);


        btnToShared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, SharedPrefActivity.class);
                startActivity(i);
            }
        });

        btnToRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, RoomDataActivity.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}