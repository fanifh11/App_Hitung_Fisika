package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class HitungTekananCair extends AppCompatActivity {

    TextInputEditText tekananCair, rho , gravitasi , ketinggian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_tekanan_cair);

        init();

    }

    private void init() {
        tekananCair = findViewById(R.id.tekananCair);
        rho = findViewById(R.id.rho);
        gravitasi = findViewById(R.id.gravitasi);
        ketinggian = findViewById(R.id.ketiggian);
    }

    public void hitungTekananCair(View view) {
        try {
            if (tekananCair.getText().toString().isEmpty()){
                double valRho = Double.parseDouble(rho.getText().toString());
                double valGravitasi = Double.parseDouble(gravitasi.getText().toString());
                double valKetinggian = Double.parseDouble(ketinggian.getText().toString());

                double cariTekananCair = valRho * valGravitasi * valKetinggian;

                tekananCair.setText(Double.toString(cariTekananCair));
            } else if (ketinggian.getText().toString().isEmpty()){
                double valTekanan = Double.parseDouble(tekananCair.getText().toString());
                double valGravitasi = Double.parseDouble(gravitasi.getText().toString());
                double valRho = Double.parseDouble(rho.getText().toString());


                double cariKetinggian =( (valRho * valGravitasi) / valTekanan);
                DecimalFormat tigaKoma = new DecimalFormat("#.###") ;
                double pembulatan = Double.valueOf(tigaKoma.format(cariKetinggian));
                ketinggian.setText(Double.toString(pembulatan));
            }
        }catch (Exception e){
            Toast.makeText(this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view) {
        tekananCair.setText("");
        ketinggian.setText("");
        rho.setText("");
        gravitasi.setText("");
    }
}