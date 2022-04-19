package com.example.uts_fajarnurdiana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Tshirt_fajar, noodle_fajar, Shoes_fajar, result_fajar;
    Button btHitung_fajar;
    private double HasilAkhir_fajar = 0.0,disc_fajar=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tshirt_fajar = (TextView) findViewById(R.id.baju);
        noodle_fajar = (TextView) findViewById(R.id.celana);
        Shoes_fajar = (TextView) findViewById(R.id.sepatu);
        result_fajar = (TextView) findViewById(R.id.hasil);

        btHitung_fajar = (Button) findViewById(R.id.hitung);
    }

    public void hitungblj(View V){
        double pan_fajar = Double.parseDouble(Tshirt_fajar.getText().toString());
        double men_fajar = Double.parseDouble(noodle_fajar.getText().toString());
        double kohi_fajar = Double.parseDouble(Shoes_fajar.getText().toString());

        if(pan_fajar>=3){
            disc_fajar=0.8;
        }
        else{
            disc_fajar=1.0;
        }

        HasilAkhir_fajar = HasilAkhir_fajar + (pan_fajar*20000.0*disc_fajar +
                men_fajar*10000.0 + kohi_fajar*5000.0);
        String hasilString_fajar = String.valueOf(HasilAkhir_fajar);
        result_fajar.setText(hasilString_fajar);
    }

    public void tambahblj(View V){
        Tshirt_fajar.setText("0");
        Shoes_fajar.setText("0");
        noodle_fajar.setText("0");
    }

    public void resetblj(View V){
        Tshirt_fajar.setText("0");
        Shoes_fajar.setText("0");
        noodle_fajar.setText("0");
        result_fajar.setText("0");
        HasilAkhir_fajar=0;
        double pan_fajar = Double.parseDouble(Tshirt_fajar.getText().toString());
        double men_fajar = Double.parseDouble(noodle_fajar.getText().toString());
        double kohi_fajar = Double.parseDouble(Shoes_fajar.getText().toString());
        pan_fajar=0; men_fajar=0; kohi_fajar=0;
    }
}