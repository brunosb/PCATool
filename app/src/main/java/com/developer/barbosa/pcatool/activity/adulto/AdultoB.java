package com.developer.barbosa.pcatool.activity.adulto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.developer.barbosa.pcatool.R;

public class AdultoB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adulto_b);

        RadioGroup grupoQ1 = new RadioGroup(this);
        RadioButton score4 = (RadioButton) findViewById(R.id.b14);
        RadioButton score3 = (RadioButton) findViewById(R.id.b13);
        RadioButton score2 = (RadioButton) findViewById(R.id.b12);
        RadioButton score1 = (RadioButton) findViewById(R.id.b11);
        RadioButton score9 = (RadioButton) findViewById(R.id.b19);


        final Button btn = (Button) findViewById(R.id.proximo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AdultoC.class);
                startActivity(intent);
            }
        });
    }
}
