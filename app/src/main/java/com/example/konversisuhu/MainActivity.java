package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText celcius, fahrenheit, kelvin, reamur;
    Button btnkonversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celcius = (EditText) findViewById(R.id.celcius);
        fahrenheit = (EditText) findViewById(R.id.fahrenheit);
        kelvin = (EditText)findViewById(R.id.kelvin);
        reamur = (EditText) findViewById(R.id.reamur);
        btnkonversi = (Button) findViewById(R.id.konversi);
        btnkonversi.setOnClickListener(this);


    }
    public void onClick(View view){
        try {
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius * 273.15;
            double nfahrenheit = ncelcius * 1.8 * 32;
            double nreamur = ncelcius * 6.8;
            fahrenheit.setText(String.valueOf(nfahrenheit));
            kelvin.setText(String.valueOf(nkelvin));
            reamur.setText(String.valueOf(nreamur));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
