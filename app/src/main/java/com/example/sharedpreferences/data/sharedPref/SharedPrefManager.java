package com.example.sharedpreferences.data.sharedPref;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPrefManager(Context context){
        sharedPreferences = context.getSharedPreferences("latihan_shared_preferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveString(String value){
        editor.putString("ini_string",value);
        editor.commit();
    }

    public String getString(){
        return sharedPreferences.getString("ini_string", "");
    }

}
