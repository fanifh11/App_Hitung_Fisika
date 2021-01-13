package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class HitungGLBB_Activity extends AppCompatActivity {
    TextInputEditText vAwal, percepatan ,waktu;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_glbb);
        init();
    }

    private void init() {
        vAwal = findViewById(R.id.vAwal);
        percepatan = findViewById(R.id.percepatan);
        waktu = findViewById(R.id.waktu);
        txtHasil = findViewById(R.id.txtHasil);
    }

    public void hitungGLBB(View view) {
        try {
            double valKecepatanAwal = Double.parseDouble(vAwal.getText().toString());
            double valPercepatan = Double.parseDouble(percepatan.getText().toString());
            double valWaktu = Double.parseDouble(waktu.getText().toString());

            double hitungGLBB = valKecepatanAwal + (valPercepatan * valWaktu);
            txtHasil.setText(Double.toString(hitungGLBB) + " m/s ");
        }catch (Exception e){
            Toast.makeText(this, "Inputan anda masih kosong", Toast.LENGTH_SHORT).show();

        }
    }

    public void reset(View view) {
        vAwal.setText("");
        waktu.setText("");
        percepatan.setText("");
        txtHasil.setText("0 m/s");
    }
}