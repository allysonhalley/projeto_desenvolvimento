package br.com.ahsr.tortuga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity{

//    CitizenLocalStore citizenLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etCpf = (EditText) findViewById(R.id.cpf);
        final EditText etPassword = (EditText) findViewById(R.id.password);
        final Button bLogin = (Button) findViewById(R.id.button_login);
        final Button btRegister = (Button) findViewById(R.id.button_register);

        btRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        } );
        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        } );


//        citizenLocalStore = new CitizenLocalStore(this);
    }

//    @Override
//    public void onClick(View v){
//         switch (v.getId()){
//             case R.id.button_login:
//                 Citizen citizen = new Citizen(null, null);
//                 citizenLocalStore.storeCitizenData(citizen);
//                 citizenLocalStore.setCitizenLoggedIn(true);
//                 startActivity(new Intent(this, MainActivity.class));
//                 break;
//             case R.id.button_register:
//                 startActivity(new Intent(this, RegisterActivity.class));
//                 break;
//         }
//    }

}