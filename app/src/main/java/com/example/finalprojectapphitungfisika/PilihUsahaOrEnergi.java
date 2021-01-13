package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PilihUsahaOrEnergi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_usaha_or_energi);
    }

    public void hitungUsaha(View view) {
        startActivity(new Intent(this,HitungUsahaActivity.class));
    }

    public void hitungPotensial(View view) {
        startActivity(new Intent(this,HitungPotensialActivity.class));
    }

    public void hitungKinetik(View view) {
        startActivity(new Intent(this,HitungKinetikActivity.class));
    }

    public void hitungMekanik(View view) {
        startActivity(new Intent(this,HitungMekanikActivity.class));
    }
}