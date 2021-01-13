package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DiffUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class HitungGLB_Activitty extends AppCompatActivity {
    TextInputEditText kecepatan, waktu , jarak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_glb__activitty);

        init();
    }

    private void init() {
        kecepatan = findViewById(R.id.kecepatan);
        waktu = findViewById(R.id.waktu);
        jarak = findViewById(R.id.jarak);
    }

    public void hitungGLB(View view) {
        try {
            if (kecepatan.getText().toString().isEmpty()){
                double valJarak = Double.parseDouble(jarak.getText().toString());
                double valWaktu = Double.parseDouble(waktu.getText().toString());

                double cariKecepatan = valJarak / valWaktu;
                kecepatan.setText(Double.toString(cariKecepatan));
            } else if (jarak.getText().toString().isEmpty()){
                double valKecepatan = Double.parseDouble(kecepatan.getText().toString());
                double valWatu = Double.parseDouble(waktu.getText().toString());

                double cariJarak = valKecepatan * valWatu;
                jarak.setText(Double.toString(cariJarak));
            } else if (waktu.getText().toString().isEmpty()){
                double valKecepatan = Double.parseDouble(kecepatan.getText().toString());
                double valJarak = Double.parseDouble(jarak.getText().toString());

                double cariWaktu = valKecepatan / valJarak;
                waktu.setText(Double.toString(cariWaktu));
            }
        } catch (Exception e){
            Toast.makeText(this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();

        }

    }

    public void reset(View view) {
        kecepatan.setText("");
        jarak.setText("");
        waktu.setText("");
    }
}