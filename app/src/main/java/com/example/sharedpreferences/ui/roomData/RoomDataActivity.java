package com.example.sharedpreferences.ui.roomData;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sharedpreferences.R;
import com.example.sharedpreferences.ui.HomeActivity;
import com.example.sharedpreferences.ui.sharedPref.SharedPrefActivity;

public class RoomDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_data);

        Button btnTambah =  findViewById(R.id.btnTambah);
        Button btnLihat =  findViewById(R.id.btnlihat);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RoomDataActivity.this, AddRoomDataActivity.class);
                startActivity(i);
            }
        });

        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RoomDataActivity.this, ViewRoomDataActivity.class);
                startActivity(i);
            }
        });

    }
}