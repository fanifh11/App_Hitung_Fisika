package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class HitungKinetikActivity extends AppCompatActivity {
    TextInputEditText kinetik, massa, kecepatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kinetik);
        
        init();
    }

    private void init() {
        kinetik = findViewById(R.id.kinetik);
        massa = findViewById(R.id.massa);
        kecepatan = findViewById(R.id.kecepatan);
    }

    public void hitungKinetik(View view) {
        try {
            if (kinetik.getText().toString().isEmpty()){
                double valMassa = Double.parseDouble(massa.getText().toString());
                double valKecepatan = Double.parseDouble(kecepatan.getText().toString());

                double cariKinetik =( 0.5 * valMassa * Math.pow(valKecepatan,2));
                kinetik.setText(Double.toString(cariKinetik));
            } else if(massa.getText().toString().isEmpty()){
                double valKinetik = Double.parseDouble(kinetik.getText().toString());
                double valKecepatan = Double.parseDouble(kecepatan.getText().toString());

                double cariMassa = ( (2*valKinetik)/Math.pow(valKecepatan,2) );
                DecimalFormat tigaKoma = new DecimalFormat("#.###") ; //Pembulatan
                double pembulatan = Double.valueOf(tigaKoma.format(cariMassa));

                massa.setText(Double.toString(pembulatan));
            } else if (kecepatan.getText().toString().isEmpty()){
                double valMassa = Double.parseDouble(massa.getText().toString());
                double valKinetik = Double.parseDouble(kinetik.getText().toString());

                double cariKecepatan = (Math.sqrt( 2*valKinetik / valMassa )  );
                DecimalFormat tigaKoma = new DecimalFormat("#.###") ; //Pembulatan
                double pembulatan = Double.valueOf(tigaKoma.format(cariKecepatan));

                kecepatan.setText(Double.toString(pembulatan));
            }
        } catch (Exception e){
            Toast.makeText(this, "Anda belum memasukkan Nilai", Toast.LENGTH_SHORT).show();

        }

    }

    public void reset(View view) {
        kinetik.setText("");
        kecepatan.setText("");
        massa.setText("");
    }
}