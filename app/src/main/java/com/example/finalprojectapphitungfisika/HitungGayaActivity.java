package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class HitungGayaActivity extends AppCompatActivity {
    TextInputEditText gaya,massa,percepatan;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_gaya);
        init();
    }

    private void init() {
        gaya = findViewById(R.id.gaya);
        massa = findViewById(R.id.massa);
        percepatan = findViewById(R.id.percepatan);
    }

    public void hitungGaya(View view) {
        try {
            if (gaya.getText().toString().isEmpty()){
                gaya.setEnabled(false);
                double valueMassa = Double.parseDouble(massa.getText().toString());
                double valuePercepatan = Double.parseDouble(percepatan.getText().toString());
                double hasil = valueMassa * valuePercepatan;
                gaya.setText(Double.toString(hasil));
            }else if (massa.getText().toString().isEmpty()){
                massa.setEnabled(false);
                double valuePercepatan = Double.parseDouble(percepatan.getText().toString());
                double valueGaya = Double.parseDouble(gaya.getText().toString());
                double hasil = valueGaya / valuePercepatan;
                massa.setText(Double.toString(hasil));
            }else if (percepatan.getText().toString().isEmpty()){
                percepatan.setEnabled(false);
                double valueGaya = Double.parseDouble(gaya.getText().toString());
                double valueMassa = Double.parseDouble(massa.getText().toString());
                double hasil = valueGaya / valueMassa;
                percepatan.setText(Double.toString(hasil));
            }


        } catch (Exception e){
            if (gaya.getText().toString().isEmpty() || massa.getText().toString().isEmpty()|| percepatan.getText().toString().isEmpty()){
                Toast.makeText(this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void reset(View view) {
        percepatan.setText("");
        massa.setText("");
        gaya.setText("");

        percepatan.setEnabled(true);
        massa.setEnabled(true);

    }
}