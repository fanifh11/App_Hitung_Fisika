package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PilihGayaOrBeratActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_gaya_or_berat);
    }

    public void hitungGaya(View view) {
        startActivity(new Intent(this,HitungGayaActivity.class));
    }

    public void hitungBerat(View view) {
        startActivity(new Intent(this,HitungBeratActivity.class));
    }
}