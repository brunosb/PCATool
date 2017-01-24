package com.developer.barbosa.pcatool;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.developer.barbosa.pcatool.Enum.Sexo;
import com.orm.SugarRecord;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnAdulto = (Button) findViewById(R.id.btnAdulto);
        final Button btnProfissional = (Button) findViewById(R.id.btnProfissional);

        btnAdulto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getApplicationContext());
                dialog.setContentView(R.layout.dialogo);
                dialog.setTitle("Cadastro");

                EditText nome = (EditText) findViewById(R.id.txtNome);
                Spinner sexo = (Spinner) findViewById(R.id.spSexo);
                Button comecar = (Button) findViewById(R.id.btnComecar);

                sexo.setAdapter(new ArrayAdapter<Sexo>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Sexo.values()));
                comecar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }
        });

        btnProfissional.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getApplicationContext());
                dialog.setContentView(R.layout.dialogo);
                dialog.setTitle("Cadastro");

                EditText nome = (EditText) findViewById(R.id.txtNome);
                Spinner sexo = (Spinner) findViewById(R.id.spSexo);
                Button comecar = (Button) findViewById(R.id.btnComecar);

                sexo.setAdapter(new ArrayAdapter<Sexo>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Sexo.values()));
                comecar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }
        });
    }

}
