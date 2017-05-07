package br.com.ahsr.tortuga.model;

/**
 * Created by Allyson on 06/05/2017.
 */

public class Citizen {

    public String name, cpf, password, phone, email,strAddress;
//    public Address address;

    public Citizen(String name, String cpf, String password, String phone, String email, String strAddress) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.strAddress = strAddress;
    }

    public Citizen(String cpf, String password) {
        this.name = "";
        this.cpf = cpf;
        this.password = password;
        this.strAddress = "";
    }

//    public void setAddress(String sAddress){
//        this.address
//
//    }
}
