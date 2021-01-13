package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class HitungUsahaActivity extends AppCompatActivity {
    TextInputEditText usaha,gaya,perpindahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_usaha);

        init();
    }

    private void init() {
        usaha = findViewById(R.id.usaha);
        gaya = findViewById(R.id.gaya);
        perpindahan = findViewById(R.id.perpindahan);
    }

    public void hitungUsaha(View view) {
        try {
            if (usaha.getText().toString().isEmpty()){
                double valGaya = Double.parseDouble(gaya.getText().toString());
                double valPerpindahan = Double.parseDouble(perpindahan.getText().toString());

                double hasilUsaha = valGaya * valPerpindahan;
                usaha.setText(Double.toString(hasilUsaha));
            } else if (gaya.getText().toString().isEmpty()){
                double valUsaha = Double.parseDouble(usaha.getText().toString());
                double valPerpindahan = Double.parseDouble(perpindahan.getText().toString());

                double hasilGaya = valUsaha / valPerpindahan;
                gaya.setText(Double.toString(hasilGaya));
            } else if (perpindahan.getText().toString().isEmpty()){
                double valUsaha = Double.parseDouble(usaha.getText().toString());
                double valGaya = Double.parseDouble(gaya.getText().toString());

                double hasilPerpindahan = valUsaha / valGaya;
                perpindahan.setText(Double.toString(hasilPerpindahan));
            }

        }catch (Exception e){
            Toast.makeText(this, "Inputan anda masih kosong", Toast.LENGTH_SHORT).show();

        }

    }

    public void reset(View view) {
        usaha.setText("");
        perpindahan.setText("");
        gaya.setText("");
    }

    public void gotoMenuGaya(View view) {
        startActivity(new Intent(this,HitungGayaActivity.class));
    }
}