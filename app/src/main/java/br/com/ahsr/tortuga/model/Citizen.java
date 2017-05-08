package br.com.ahsr.tortuga.model;

/**
 * Created by Allyson on 06/05/2017.
 */

public class Citizen {

    public String name, email, strAddress;
    public int cpf, password, phone, cep , number;

    public Citizen(String name, int cpf, int password, int phone, String email, int cep, int number, String strAddress) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.cep = cep;
        this.number = number;
        this.strAddress = strAddress;
    }

    public Citizen(String name, int cpf, int password, int phone, String email, int cep, int number) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.cep = cep;
        this.number = number;
        this.strAddress = "";
    }

    public Citizen(String name, int cpf, int password, int cep, int number) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.phone = -1;
        this.email = "";
        this.cep = cep;
        this.number = number;
        this.strAddress = "";
    }

    public Citizen(int cpf, int password) {
        this.name = "";
        this.cpf = cpf;
        this.password = password;
        this.phone = -1;
        this.email = "";
        this.cep = -1;
        this.number = -1;
        this.strAddress = "";
    }
}
