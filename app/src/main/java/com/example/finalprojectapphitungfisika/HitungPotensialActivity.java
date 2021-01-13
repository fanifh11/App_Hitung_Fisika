package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class HitungPotensialActivity extends AppCompatActivity {

    TextInputEditText potensial, massa, gravitasi ,ketinggian ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_potensial);

        init();
    }

    private void init() {
        potensial = findViewById(R.id.potensial);
        massa = findViewById(R.id.massa);
        gravitasi = findViewById(R.id.gravitasi);
        ketinggian = findViewById(R.id.ketinggian);
    }

    public void hitungPotensial(View view) {
        try {
            if (potensial.getText().toString().isEmpty()){
                double valMassa = Double.parseDouble(massa.getText().toString());
                double valGravitasi = Double.parseDouble(gravitasi.getText().toString());
                double valKetinggian = Double.parseDouble(ketinggian.getText().toString());

                double cariPotensial = valMassa * valGravitasi * valKetinggian;

                potensial.setText(Double.toString(cariPotensial));
            } else if (massa.getText().toString().isEmpty()){
                double valGravitasi = Double.parseDouble(gravitasi.getText().toString());
                double valKetinggian = Double.parseDouble(ketinggian.getText().toString());
                double valPotensial = Double.parseDouble(potensial.getText().toString());

                double cariMassa = ( (valGravitasi * valKetinggian) / valPotensial );

                massa.setText(Double.toString(cariMassa));
            } else if (ketinggian.getText().toString().isEmpty()){
                double valMassa = Double.parseDouble(massa.getText().toString());
                double valGravitasi = Double.parseDouble(gravitasi.getText().toString());
                double valPotensial = Double.parseDouble(potensial.getText().toString());

                double cariKetinggian = ((valMassa * valGravitasi ) / valPotensial);
                ketinggian.setText(Double.toString(cariKetinggian));
            }
        }catch (Exception e){
            Toast.makeText(this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view) {
        potensial.setText("");
        massa.setText("");
        gravitasi.setText("");
        ketinggian.setText("");
    }
}