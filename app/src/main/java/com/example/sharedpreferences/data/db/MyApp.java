package com.example.sharedpreferences.data.db;

import android.app.Application;

import androidx.room.Room;

public class MyApp extends Application {

    public static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"mahasiswa").allowMainThreadQueries().build();
    }

}