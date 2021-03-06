package com.devsteve.test.Comunicacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.devsteve.test.R;

import org.w3c.dom.Text;

public class Comunicacion1Activity extends AppCompatActivity {

    private RadioGroup rbgcomuni, rbgcomuni1, rbgcomuni2, rbgcomuni3;
    private RadioGroup rbg1comuni, rbg1comuni2, rbg1comuni3, rbg2comuni;
    private RadioButton rd1comuni, rd2comuni, rd3comuni,rdcomuni7, rdcomuni8, rdcomuni9,
    rdcomunica1, rdcomunica2, rdcomunica3, rdcomunica4, rdcomunica5, rdcomunica6
            ,rdcomunica7, rdcomunica8, rdcomunica9;
    private RadioButton rdcomuni1, rdcomuni2, rdcomuni3, rdcomuni4, rdcomuni5, rdcomuni6,
        rdcom1, rdcom2, rdcom3;

    private TextView cambiarbutton, cambiarbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion1);

        //Hechos
        rbgcomuni = findViewById(R.id.rbg_Comunicacion);
        rd1comuni = findViewById(R.id.rdcomunicacion_1);
        rd2comuni = findViewById(R.id.rdcomunicacion_2);
        rd3comuni = findViewById(R.id.rdcomunicacion_3);
        rbgcomuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rdcomunicacion_1:
                        if (rd1comuni.isChecked() == true) {
                            rdcomuni1.setEnabled(false);
                            rd2comuni.setEnabled(false);
                            rd3comuni.setEnabled(false);
                            rdcomuni4.setEnabled(false);
                            rdcomuni7.setEnabled(false);
                        }if (rd1comuni.isChecked() == true){
                        rdcomuni2.setEnabled(true);
                        rdcomuni5.setEnabled(true);
                        rdcomuni8.setEnabled(true);
                    }

                        break;

                    case R.id.rdcomunicacion_2:
                        if (rd2comuni.isChecked()) {
                            rd3comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                        }

                        break;
                    case R.id.rdcomunicacion_3:
                        break;

                }
            }
        });
        //Resultados
        rbgcomuni1 = findViewById(R.id.rbg_Comunicacion1);
        rdcomuni1 = findViewById(R.id.rdcomunicacion1_1);
        rdcomuni2 = findViewById(R.id.rdcomunicacion1_2);
        rdcomuni3 = findViewById(R.id.rdcomunicacion1_3);
        rbgcomuni1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ix) {
                switch (ix) {
                    case R.id.rdcomunicacion1_1:
                        if (rdcomuni1.isChecked()) {
                            rd1comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni3.setEnabled(false);
                            rdcomuni4.setEnabled(false);
                            rdcomuni7.setEnabled(false);
                        }if(rdcomuni1.isChecked() == true){
                            rd2comuni.setEnabled(true);
                            rdcomuni5.setEnabled(true);
                            rdcomuni8.setEnabled(true);
                    }
                        break;
                    case R.id.rdcomunicacion1_2:

                        if (rdcomuni2.isChecked()) {
                            rd2comuni.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni3.setEnabled(false);
                        }
                        break;

                }

            }
        });
        //Personas
        rbgcomuni2 = findViewById(R.id.rbg_Comunicacion2);
        rdcomuni4 = findViewById(R.id.rdcomunicacion2_1);
        rdcomuni5 = findViewById(R.id.rdcomunicacion2_2);
        rdcomuni6 = findViewById(R.id.rdcomunicacion2_3);
        rbgcomuni2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ir) {
                switch (ir) {
                    case R.id.rdcomunicacion2_1:
                        if (rdcomuni4.isChecked()) {
                            rd1comuni.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni6.setEnabled(false);
                            rdcomuni1.setEnabled(false);
                            rdcomuni7.setEnabled(false);
                        }
                        if(rdcomuni4.isChecked() == true){
                            rd2comuni.setEnabled(true);
                            rdcomuni2.setEnabled(true);
                            rdcomuni8.setEnabled(true);
                        }
                        break;
                    case R.id.rdcomunicacion2_2:
                        if (rdcomuni5.isChecked()) {
                            rd2comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni6.setEnabled(false);
                        }
                        break;
                }

            }
        });
        //Ideas
        rbgcomuni3 = findViewById(R.id.rbg_Comunicacion3);
        rdcomuni7 = findViewById(R.id.rdcomunicacion3_1);
        rdcomuni8 = findViewById(R.id.rdcomunicacion3_2);
        rdcomuni9 = findViewById(R.id.rdcomunicacion3_3);
        rbgcomuni3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ie) {
                switch (ie) {
                    case R.id.rdcomunicacion3_1:
                        if (rdcomuni7.isChecked()) {
                            rd1comuni.setEnabled(false);
                            rdcomuni1.setEnabled(false);
                            rdcomuni4.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni9.setEnabled(false);
                        }
                        if (rdcomuni7.isChecked() == true){
                            rd2comuni.setEnabled(true);
                            rdcomuni2.setEnabled(true);
                            rdcomuni5.setEnabled(true);
                        }
                        break;
                    case R.id.rdcomunicacion3_2:
                        if (rdcomuni8.isChecked()) {
                            rd2comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni9.setEnabled(false);
                        }
                        break;


                }
            }
        });

        //----------Pregunta numero 2-----------
        //Exactitud
        rbg1comuni = findViewById(R.id.rbg1_Comunicacion);
        rdcomunica1 = findViewById(R.id.rd1comunicacion_1);
        rdcomunica2 = findViewById(R.id.rd1comunicacion_2);
        rdcomunica3 = findViewById(R.id.rd1comunicacion_3);
        rbg1comuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inv) {
                switch (inv){
                    case R.id.rd1comunicacion_1:
                        if (rdcomunica1.isChecked() == true) {
                            rdcomunica2.setEnabled(false);
                            rdcomunica3.setEnabled(false);
                            rdcomunica4.setEnabled(false);
                            rdcomunica7.setEnabled(false);
                            rdcom1.setEnabled(false);
                        }if (rdcomunica1.isChecked() == true){
                            rdcomunica5.setEnabled(true);
                            rdcomunica8.setEnabled(true);
                            rdcom2.setEnabled(true);

                    }

                        break;
                    case R.id.rd1comunicacion_2:
                        if (rdcomunica2.isChecked() == true) {
                            rdcom2.setEnabled(false);
                            rdcomunica5.setEnabled(false);
                            rdcomunica8.setEnabled(false);
                            rdcomunica3.setEnabled(false);
                        }
                        break;
                    case R.id.rd1comunicacion_3:
                        break;
                }
            }
        });
        //Impacto
        rbg1comuni2 = findViewById(R.id.rbg2_Comunicacion);
        rdcomunica4 = findViewById(R.id.rd2comunicacion_1);
        rdcomunica5 = findViewById(R.id.rd2comunincacion_2);
        rdcomunica6 = findViewById(R.id.rd2comunicacion_3);
        rbg1comuni2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inchek) {
                switch (inchek){
                    case R.id.rd2comunicacion_1:
                        if (rdcomunica4.isChecked() == true){
                            rdcomunica1.setEnabled(false);
                            rdcomunica5.setEnabled(false);
                            rdcomunica6.setEnabled(false);
                            rdcomunica7.setEnabled(false);
                            rdcom1.setEnabled(false);
                        }if (rdcomunica4.isChecked() == true){
                            rdcomunica8.setEnabled(true);
                            rdcom2.setEnabled(true);
                    }
                        break;
                    case R.id.rd2comunincacion_2:
                        if (rdcomunica5.isChecked()){
                            rdcomunica8.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcomunica6.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                        }
                        break;
                    case R.id.rd2comunicacion_3:
                        break;
                }
            }
        });
        //Contribucion
        rbg1comuni3 = findViewById(R.id.rbg3_Comunicacion);
        rdcomunica7 = findViewById(R.id.rd3comunicacion_1);
        rdcomunica8 = findViewById(R.id.rd3comunicacion_2);
        rdcomunica9 = findViewById(R.id.rd3comunicacion_3);
        rbg1comuni3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inch) {
                switch(inch){
                    case R.id.rd3comunicacion_1:
                            if (rdcomunica7.isChecked()){
                                rdcomunica8.setEnabled(false);
                                rdcomunica9.setEnabled(false);
                                rdcomunica1.setEnabled(false);
                                rdcomunica4.setEnabled(false);
                                rdcom1.setEnabled(false);
                            }if (rdcomunica7.isChecked() ==true){
                                rdcomunica5.setEnabled(true);
                                rdcomunica2.setEnabled(true);
                                rdcom2.setEnabled(true);
                    }
                        break;
                    case R.id.rd3comunicacion_2:
                        if (rdcomunica8.isChecked()){
                            rdcomunica5.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcomunica9.setEnabled(false);
                        }

                        break;
                    case R.id.rd3comunicacion_3:
                        break;
                }
            }
        });
        //Creatividad
        rbg2comuni = findViewById(R.id.rbg4_Comunicacion);
        rdcom1 = findViewById(R.id.rd4comunicacion_1);
        rdcom2 = findViewById(R.id.rd4comunicacion_2);
        rdcom3 = findViewById(R.id.rd4comunicacion_3);
        rbg2comuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inc) {
                switch (inc){
                    case R.id.rd4comunicacion_1:
                        if (rdcom1.isChecked()){
                            rdcomunica7.setEnabled(false);
                            rdcomunica1.setEnabled(false);
                            rdcomunica4.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcom3.setEnabled(false);
                        }if (rdcom1.isChecked() == true){
                            rdcomunica5.setEnabled(true);
                            rdcomunica8.setEnabled(true);
                            rdcomunica2.setEnabled(true);
                    }
                        break;
                    case R.id.rd4comunicacion_2:
                        if (rdcom2.isChecked()){
                            rdcomunica5.setEnabled(false);
                            rdcomunica8.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                            rdcom3.setEnabled(false);
                        }
                        break;
                    case R.id.rd4comunicacion_3:
                        if (rdcom3.isChecked() || rdcomunica9.isChecked() || rdcomunica6.isChecked()){
                            Intent intent = new Intent(Comunicacion1Activity.this, Comunicacion2Activity.class);
                            startActivity(intent);
                        }
                        break;
                }
            }
        });
        //borra opcion Pregunta 1
        cambiarbutton = findViewById(R.id.Tv_CambiarComunicacion1);
        cambiarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton.isClickable() == true){
                    rbgcomuni.clearCheck();
                    rd1comuni.setEnabled(true);
                    rd2comuni.setEnabled(true);
                    rd3comuni.setEnabled(true);
                    rbgcomuni1.clearCheck();
                    rdcomuni1.setEnabled(true);
                    rdcomuni2.setEnabled(true);
                    rdcomuni3.setEnabled(true);
                    rbgcomuni2.clearCheck();
                    rdcomuni4.setEnabled(true);
                    rdcomuni5.setEnabled(true);
                    rdcomuni6.setEnabled(true);
                    rbgcomuni3.clearCheck();
                    rdcomuni7.setEnabled(true);
                    rdcomuni8.setEnabled(true);
                    rdcomuni9.setEnabled(true);
                }

            }
        });
        //borra opcion Pregunta 2
        cambiarbutton2 = findViewById(R.id.Tv_CambiarComunicacion2);
        cambiarbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton2.isClickable() == true){
                    rbg1comuni.clearCheck();
                    rdcomunica1.setEnabled(true);
                    rdcomunica2.setEnabled(true);
                    rdcomunica3.setEnabled(true);
                    rbg1comuni2.clearCheck();
                    rdcomunica4.setEnabled(true);
                    rdcomunica5.setEnabled(true);
                    rdcomunica6.setEnabled(true);
                    rbg1comuni3.clearCheck();
                    rdcomunica7.setEnabled(true);
                    rdcomunica8.setEnabled(true);
                    rdcomunica9.setEnabled(true);
                    rbg2comuni.clearCheck();
                    rdcom1.setEnabled(true);
                    rdcom2.setEnabled(true);
                    rdcom3.setEnabled(true);
                }
            }
        });
    }
}