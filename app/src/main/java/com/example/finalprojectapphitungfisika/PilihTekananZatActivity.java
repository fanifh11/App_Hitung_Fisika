package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PilihTekananZatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_tekanan_zat);
    }

    public void hitungTekananPadat(View view) {
        startActivity(new Intent(this,HitungTekananPadat.class));
    }

    public void hitungTekananCair(View view) {
        startActivity(new Intent(this,HitungTekananCair.class));
    }

    public void hitungGayaApung(View view) {
        startActivity(new Intent(this,HitungGayaApungActivity.class));
    }
}