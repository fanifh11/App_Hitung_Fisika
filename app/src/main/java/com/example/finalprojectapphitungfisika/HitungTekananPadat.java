package com.example.finalprojectapphitungfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class HitungTekananPadat extends AppCompatActivity {
    TextInputEditText tekanan, gaya, luas , berat , massa , gravitasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_tekanan_padat);

        init();
    }

    private void init() {
        tekanan = findViewById(R.id.tekanan);
        gaya = findViewById(R.id.gaya);
        luas = findViewById(R.id.luas);
        berat = findViewById(R.id.berat);
        massa =findViewById(R.id.massa);
        gravitasi = findViewById(R.id.gravitasi);
    }

    public void hitungTekanan(View view) {
        try {
           if (tekanan.getText().toString().isEmpty()){
               tekanan.setEnabled(false);
               double valGaya = Double.parseDouble(gaya.getText().toString());
               double valLuas = Double.parseDouble(luas.getText().toString());
               double cariTekanan = valGaya / valLuas;

               DecimalFormat tigaKoma = new DecimalFormat("#.###") ;
               double pembulatan = Double.valueOf(tigaKoma.format(cariTekanan));
               tekanan.setText(Double.toString (pembulatan));
           } else if (gaya.getText().toString().isEmpty()){
               gaya.setEnabled(false);
               double valTekanan = Double.parseDouble(tekanan.getText().toString());
               double valLuas = Double.parseDouble(luas.getText().toString());
               double cariGaya = valTekanan * valLuas;
               gaya.setText(Double.toString(cariGaya));
           } else if (luas.getText().toString().isEmpty()){
               luas.setEnabled(false);
               double valTekanan = Double.parseDouble(tekanan.getText().toString());
               double valGaya = Double.parseDouble(gaya.getText().toString());
               double cariLuas = valGaya / valTekanan;

               DecimalFormat tigaKoma = new DecimalFormat("#.###") ;
               double pembulatan = Double.valueOf(tigaKoma.format(cariLuas));
               luas.setText(Double.toString(pembulatan));
           }
        }catch (Exception e){
            if (tekanan.getText().length()==0 || gaya.getText().toString().length()==0 || tekanan.getText().length()==0){
                Toast.makeText(this, "Masukkan masih kosong !", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void resetTekanan(View view) {
        tekanan.setText("");
        gaya.setText("");
        luas.setText("");
    }

    public void hitungBerat(View view) {
        try {
            if (berat.getText().toString().isEmpty()) {
                berat.setEnabled(false);
                double valueMassa = Double.parseDouble(massa.getText().toString());
                double valueGravitasi = Double.parseDouble(gravitasi.getText().toString());

                double cariBerat = valueMassa * valueGravitasi;
                DecimalFormat tigaKoma = new DecimalFormat("#.###");
                double pembulatan = Double.valueOf(tigaKoma.format(cariBerat));

                berat.setText(Double.toString (pembulatan));
            } else if (massa.getText().toString().isEmpty()){
                massa.setEnabled(false);
                double valueBerat = Double.parseDouble(berat.getText().toString());
                double valueGravitasi = Double.parseDouble(gravitasi.getText().toString());

                double cariMassa = (valueBerat / valueGravitasi);
                DecimalFormat tigaKoma = new DecimalFormat("#.###");
                double pembulatan = Double.valueOf(tigaKoma.format(cariMassa));

                massa.setText(Double.toString(pembulatan));
            }
        }catch (Exception e){
            Toast.makeText(this, "Inputan anda masih kosong", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetBerat(View view) {
        berat.setText("");
        massa.setText("");
        gravitasi.setText("");

        berat.setEnabled(true);
        massa.setEnabled(true);


    }
}