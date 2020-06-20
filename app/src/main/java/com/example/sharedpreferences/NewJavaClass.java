package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class NewJavaClass {
    private SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public NewJavaClass(Context context){
        sharedPreferences = context.getSharedPreferences("new_latihan_shared_pref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveNama(String value){
        editor.putString("sp_nama",value);
        editor.commit();
    }

    public String getNama(){
        return sharedPreferences.getString("sp_nama","");
    }

}
