package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Lihat_data extends AppCompatActivity {

    Button btnHapus, btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        btnEdit = findViewById(R.id.btHapus);
        btnHapus = findViewById(R.id.btEdit);
    }
}