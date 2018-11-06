package com.example.jaime.datospersonales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
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
        txtEstadoCivil = findViewById(R.id.txtEstadoCivil);
        SpinnerEstadoCivil = findViewById(R.id.spinnerEstadoCivil);
    }
  int a = 0;
}
