package br.com.ahsr.tortuga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText) findViewById(R.id.register_name);
        final EditText etCpf = (EditText) findViewById(R.id.register_cpf);
        final EditText etPassword = (EditText) findViewById(R.id.register_password);
        final EditText etPhone = (EditText) findViewById(R.id.register_phone);
        final EditText etEmail = (EditText) findViewById(R.id.register_email);
        final EditText etCep = (EditText) findViewById(R.id.register_cep);
        final EditText etNumber = (EditText) findViewById(R.id.register_number);

        final Button bRegister = (Button) findViewById(R.id.button_register);

        bRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String name = etName.getText().toString();
                final int cpf = Integer.parseInt(etCpf.getText().toString());
                final int password = Integer.parseInt(etPassword.getText().toString());
                final int phone = Integer.parseInt(etPhone.getText().toString());
                final String email = etEmail.getText().toString();
                final int cep = Integer.parseInt(etCep.getText().toString());
                final int number = Integer.parseInt(etNumber.getText().toString());

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response){
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if(success){
                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            }else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Cadastro Falhou.")
                                        .setNegativeButton("Retry", null).create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name, cpf, password, email, phone, cep, number, responseListener );
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
}
