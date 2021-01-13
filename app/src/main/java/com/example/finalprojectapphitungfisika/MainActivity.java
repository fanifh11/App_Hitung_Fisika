package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gayadanberat(View view) {
        startActivity(new Intent(this,PilihGayaOrBeratActivity.class));
    }

    public void gotoMenuPilTekanan(View view) {
        startActivity(new Intent(this,PilihTekananZatActivity.class));
    }

    public void gotoMenuPilUsaha(View view) {
        startActivity(new Intent(this,PilihUsahaOrEnergi.class));
    }

    public void hitungGLB(View view) {
        startActivity(new Intent(this,HitungGLB_Activitty.class));
    }

    public void hitungGLBB(View view) {
        startActivity(new Intent(this,HitungGLBB_Activity.class));
    }
}