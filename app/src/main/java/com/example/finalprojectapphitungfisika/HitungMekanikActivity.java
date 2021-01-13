package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class HitungMekanikActivity extends AppCompatActivity {

    TextInputEditText potensial , kinetik;
    TextView txtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_mekanik);

        init();
    }

    private void init() {
        potensial = findViewById(R.id.potensial);
        kinetik = findViewById(R.id.kinetik);
        txtHasil = findViewById(R.id.txtHasil);
    }

    public void hitungMekanik(View view) {
        try {
            double valPotensial = Double.parseDouble(potensial.getText().toString());
            double valKinetik = Double.parseDouble(kinetik.getText().toString());

            double cariMekanik = valKinetik + valPotensial;
            txtHasil.setText(Double.toString(cariMekanik));
        }catch (Exception exception){
            Toast.makeText(this, "Inputan masih kosong", Toast.LENGTH_SHORT).show();
        }

    }

    public void reset(View view) {
        potensial.setText("");
        kinetik.setText("");
        txtHasil.setText("0 Joule");
    }
}