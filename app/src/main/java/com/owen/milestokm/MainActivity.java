package com.owen.milestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the views using IDs
        Button btnKm2Miles = findViewById(R.id.btnKmToMiles);
        Button btnMils2Km = findViewById(R.id.btnMilesToKm);


        // Setting onClick listeners to respond to button clicks
        btnKm2Miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the edit text input and convert them to string values
                final EditText etMilesToKm = findViewById(R.id.etMilesToKm);
                final EditText etKmToMiles = findViewById(R.id.etKmToMiles);

                double vMiles = Double.valueOf(etKmToMiles.getText().toString());

                //convert the vlues in double from the string inputs

                double vKm = vMiles / 0.62137;

                //format the value in decimal
                DecimalFormat format = new DecimalFormat("##.##");
                etMilesToKm.setText(format.format(vKm));


            }
        });
        btnMils2Km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the IDs
                final EditText etKmToMiles = findViewById(R.id.etKmToMiles);
                final EditText etMilesToKm = findViewById(R.id.etMilesToKm);

                //do the converstion/
                // Assgined task
                double vMiles = Double.valueOf(etMilesToKm.getText().toString());
                double vKilometers = vMiles / 0.621327;

                DecimalFormat format = new DecimalFormat("##.##");
                etKmToMiles.setText(format.format(vKilometers));

            }
        });
    }
}