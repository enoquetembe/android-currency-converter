package com.enoque.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText meticalEditText = findViewById(R.id.metical_txt);
    private TextView resultTxt = findViewById(R.id.result_txt);
    Button btnConvert = findViewById(R.id.convert_btn);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double meticalValor = Double.parseDouble(meticalEditText.getText().toString());
                double dolar = meticalValor * 63;

                resultTxt.setText("" +dolar);
            }
        });
    }




}