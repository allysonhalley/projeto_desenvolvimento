package br.com.ahsr.tortuga.repository;

import android.content.Context;
import android.content.SharedPreferences;

import br.com.ahsr.tortuga.model.Citizen;

/**
 * Created by Allyson on 07/05/2017.
 */

public class CitizenLocalStore {

    public static final String SP_NAME = "citizenDatail";
    SharedPreferences citizenLocalDataBase;

    public CitizenLocalStore(Context context){
        citizenLocalDataBase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeCitizenData(Citizen citizen){
        SharedPreferences.Editor spEditor = citizenLocalDataBase.edit();
        spEditor.putString("name", citizen.name);
        spEditor.putString("cpf", citizen.cpf);
        spEditor.putString("password", citizen.password);
        spEditor.putString("phone", citizen.phone);
        spEditor.putString("email", citizen.email);
        spEditor.putString("strAddress", citizen.strAddress);
        spEditor.commit();
    }

    public Citizen getLoggedInCitizen(){
        String name = citizenLocalDataBase.getString("name", "");
        String cpf = citizenLocalDataBase.getString("cpf", "");
        String password = citizenLocalDataBase.getString("password", "");
        String phone = citizenLocalDataBase.getString("phone", "");
        String email= citizenLocalDataBase.getString("email", "");
        String strAddress = citizenLocalDataBase.getString("strAddress", "");

        Citizen storeCitizen = new Citizen(name, cpf, password, phone, email, strAddress);

        return storeCitizen;
    }

    public void setCitizenLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = citizenLocalDataBase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getCitizenLoggedIn(){
        if(citizenLocalDataBase.getBoolean("loggedIn", false) == false){
            return true;
        }else{
            return false;
        }
    }

    public void clearCitizenData(){
        SharedPreferences.Editor spEditor = citizenLocalDataBase.edit();
        spEditor.clear();
        spEditor.commit();
    }


}
