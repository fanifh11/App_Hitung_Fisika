package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class HitungGayaApungActivity extends AppCompatActivity {
    TextInputEditText gayaApung , rho , gravitasi ,volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_gaya_apung);
        init();
    }

    private void init() {
        gayaApung = findViewById(R.id.gayaApung);
        rho = findViewById(R.id.rho);
        gravitasi = findViewById(R.id.gravitasi);
        volume = findViewById(R.id.volume);
    }

    public void hitungGayaApung(View view) {
        try {
            if (gayaApung.getText().toString().isEmpty()){
                double valRho = Double.parseDouble(rho.getText().toString());
                double valGravitasi = Double.parseDouble(gravitasi.getText().toString());
                double valVolume = Double.parseDouble(volume.getText().toString());

                double cariGA = valRho * valGravitasi * valVolume;

                gayaApung.setText(Double.toString(cariGA));
            } else if (volume.getText().toString().isEmpty()){
                double valRho = Double.parseDouble(rho.getText().toString());
                double valGravitasi = Double.parseDouble(gravitasi.getText().toString());
                double valGA = Double.parseDouble(gayaApung.getText().toString());

                double cariVolume = ( (valRho * valGravitasi) / valGA );
                DecimalFormat tigaKoma = new DecimalFormat("#.###") ;
                double pembulatan = Double.valueOf(tigaKoma.format(cariVolume));

                volume.setText(Double.toString(pembulatan));
            }

        }catch (Exception exception){
            Toast.makeText(this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view) {
        gayaApung.setText("");
        rho.setText("");
        gravitasi.setText("");
        volume.setText("");
    }
}