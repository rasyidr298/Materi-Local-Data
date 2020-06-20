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

    //Deklarasi dan Inisialisasi class sharedPrefManager
    private SharedPrefManager sharedPrefManager;

    //Digunakan Untuk Konfigurasi SharedPreferences
    private SharedPreferences.Editor editor;

    //inisialisai newJavaClass
    private NewJavaClass newJavaClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.eTinput);
        textView = findViewById(R.id.tvOutput);
        button = findViewById(R.id.btSave);

        //membuat object class SharedPrefManager
        sharedPrefManager = new SharedPrefManager(this);

        //membuat object class NewJavaClass
        newJavaClass = new NewJavaClass(this);

        //get String before
        textView.setText(newJavaClass.getNama());

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

        //save value
        newJavaClass.saveNama(getKonten);
        //get Value
        textView.setText(getKonten);
    }

}