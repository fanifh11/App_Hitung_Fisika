package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class HitungBeratActivity extends AppCompatActivity {
    TextInputEditText berat, massa,gravitasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_berat);

        initialization();
    }

    private void initialization() {
        berat = findViewById(R.id.berat);
        massa = findViewById(R.id.massa);
        gravitasi = findViewById(R.id.gravitasi);
    }

    public void hitungBerat(View view) {
        try {
            if (berat.getText().toString().isEmpty()){

                double valueMassa = Double.parseDouble(massa.getText().toString());
                double valueGravitasi = Double.parseDouble(gravitasi.getText().toString());

                double cariBerat  = valueMassa * valueGravitasi ;
                DecimalFormat tigaKoma = new DecimalFormat("#.####") ;
                double pembulatan = Double.valueOf(tigaKoma.format(cariBerat));

                berat.setText(Double.toString(pembulatan));
            } else if (massa.getText().toString().isEmpty()){

                double valueBerat = Double.parseDouble(berat.getText().toString());
                double valueGravitasi = Double.parseDouble(gravitasi.getText().toString());

                double cariMassa = valueBerat / valueGravitasi;
                DecimalFormat tigaKoma = new DecimalFormat("#.###") ;
                double pembulatan = Double.valueOf(tigaKoma.format(cariMassa));

                massa.setText(Double.toString(pembulatan));
            }

        } catch (Exception e){
            if (berat.getText().toString().isEmpty() && massa.getText().toString().isEmpty()){
                Toast.makeText(this, "berat atau massa anda masih kosong", Toast.LENGTH_SHORT).show();
            } else if ( (berat.getText().toString().isEmpty() && massa.getText().toString().isEmpty() ) || gravitasi.getText().toString().isEmpty()  ){
                Toast.makeText(this, "gravitasi kosong", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void reset(View view) {
        berat.setText("");
        massa.setText("");
        gravitasi.setText("");

        berat.setEnabled(true);
        massa.setEnabled(true);
    }
}