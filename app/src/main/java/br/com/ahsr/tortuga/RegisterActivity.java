package br.com.ahsr.tortuga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.ahsr.tortuga.model.Citizen;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    Button bRegister;
    EditText etName, etCpf, etPassword, etPhone, etEmail, etCep, etAdressNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.register_name);
        etCpf = (EditText) findViewById(R.id.register_cpf);
        etPassword = (EditText) findViewById(R.id.register_password);
        etPhone = (EditText) findViewById(R.id.register_phone);
        etEmail = (EditText) findViewById(R.id.register_email);
        etCep = (EditText) findViewById(R.id.register_cep);
        etAdressNumber = (EditText) findViewById(R.id.register_number);
        bRegister = (Button) findViewById(R.id.button_register);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_register:
                String name = etName.getText().toString();
                String cpf = etName.getText().toString();
                String password = etPassword.getText().toString();
                String phone = etName.getText().toString();
                String email = etName.getText().toString();
                String strAddress = etCep.getText().toString()+","+etAdressNumber.getText().toString();

                Citizen registeredData = new Citizen(name, cpf, password, phone, email, strAddress);

                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
