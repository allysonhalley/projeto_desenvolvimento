package br.com.ahsr.tortuga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.ahsr.tortuga.model.Citizen;
import br.com.ahsr.tortuga.repository.CitizenLocalStore;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLogout, bCollect;
    EditText etName;
    CitizenLocalStore citizenLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.register_name);
        bCollect = (Button) findViewById(R.id.button_colect);
        bLogout = (Button) findViewById(R.id.button_logout);

        bCollect.setOnClickListener(this);
        bLogout.setOnClickListener(this);

        citizenLocalStore = new CitizenLocalStore(this);
    }

    @Override
    public void onStart(){
        super.onStart();
    }

    private boolean authenticate(){
        return citizenLocalStore.getCitizenLoggedIn();
    }
    private void displayCitizenDetails(){
        Citizen citizen = citizenLocalStore.getLoggedInCitizen();
        etName.setText(citizen.name);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_logout:
                citizenLocalStore.clearCitizenData();
                citizenLocalStore.setCitizenLoggedIn(false);

                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.button_colect:
                startActivity(new Intent(this, CollectActivity.class));
                break;
        }
    }
}