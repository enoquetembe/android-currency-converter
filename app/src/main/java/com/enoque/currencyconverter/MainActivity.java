package com.enoque.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  TextView txtResult;
    private Button btnResult;
    private  EditText etxtValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.result_txt);
        btnResult = findViewById(R.id.convert_btn);
        etxtValue = findViewById(R.id.metical_txt);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double meticalValue = Double.valueOf(etxtValue.getText().toString());
                Double dolar = 63.0;

                Double convert = meticalValue * dolar;


                txtResult.setText("" +convert);
            }
        });

    }

}