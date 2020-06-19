package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variable Pendukung
    private TextView textView;
    private EditText editText;
    private Button button;

    //Deklarasi dan Inisialisasi SharedPreferences
    private SharedPreferences preferences;

    //Digunakan Untuk Konfigurasi SharedPreferences
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.eTinput);
        textView = findViewById(R.id.tvOutput);
        button = findViewById(R.id.btSave);

        //Membuat File Baru Beserta Modifiernya
        preferences = getSharedPreferences("Belajar_SharedPreferences", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
                Toast.makeText(getApplicationContext(),"Data Tersimpan", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getData(){
        //Mendapatkan Input dari user
        String getKonten = editText.getText().toString();

        //Digunakan Untuk Pengaturan Konfigurasi SharedPreferences
        editor = preferences.edit();

        //Memasukan Data Pada Editor SharedPreferences dengan key (data_saya)
        editor.putString("data_saya", getKonten);

        //Menjalankan Operasi
        editor.apply();

        //Menampilkan Output

        textView.setText("Output Data : "+preferences.getString("data_saya", null));
    }

}