package com.example.jaime.datospersonales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txtNombre;
    EditText editNombre;
    TextView txtApellidos;
    EditText editApellidos;
    TextView txtEdad;
    EditText editEdad;
    TextView txtGenero;
    RadioGroup grupoGenero;
    RadioButton buttonHombre;
    RadioButton buttonMujer;
    TextView txtEstadoCivil;
    Spinner SpinnerEstadoCivil;
    TextView txtHijos;
    Button btnGenerar;
    ImageButton btnEliminar;
    TextView txtInformacion;
    Switch idswitch;
    String Genero = "";
    String switch1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombre = findViewById(R.id.editNombre);
        editApellidos = findViewById(R.id.editApellidos);
        editEdad = findViewById(R.id.editEdad);
        grupoGenero = findViewById(R.id.grupoGenero);
        buttonHombre = findViewById(R.id.buttonHombre);
        buttonMujer = findViewById(R.id.buttonMujer);
        SpinnerEstadoCivil = findViewById(R.id.spinnerEstadoCivil);
        btnGenerar = findViewById(R.id.btnGenerar);
        btnEliminar = findViewById(R.id.btnEliminar);
        idswitch = findViewById(R.id.idswitch);
        txtInformacion = findViewById(R.id.txtInformacion);


        String[] informacion = new String[] {"","Casado", "Separado", "Viudo", "Otro"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, informacion);
        SpinnerEstadoCivil.setAdapter(adaptador);


        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                
                editNombre.setText("");
                editApellidos.setText("");
                editEdad.setText("");
                buttonHombre.setChecked(false);
                buttonMujer.setChecked(false);
                SpinnerEstadoCivil.setSelection(0);
                idswitch.setChecked(false);
            }

        });

        grupoGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.buttonHombre) Genero = "Hombre";
                if (checkedId == R.id.buttonMujer)  Genero = "Mujer";
            }
        });

        idswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (idswitch.isChecked() == true)
                {
                    switch1 = "Si tiene Hijos" ;
                }
                if (idswitch.isChecked() == false)
                {
                    switch1 = "No tiene Hijos" ;
                }

            }
        });

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                txtInformacion.setText(editApellidos.getText().toString() + " " + editNombre.getText().toString() + " " + editEdad.getText().toString() + " " + Genero + " " + switch1 + " " );


            }
        });

    }
}

