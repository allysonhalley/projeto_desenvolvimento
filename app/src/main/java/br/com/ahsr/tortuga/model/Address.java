package br.com.ahsr.tortuga.model;

/**
 * Created by Allyson on 07/05/2017.
 */

public class Address {
    public String cep, number, full;

    public Address(String cep, String number, String full) {
        this.cep = cep;
        this.number = number;
        this.full = full;
    }

    public Address(String cep, String number) {
        this.cep = cep;
        this.number = number;
        this.full = "";
    }

    public Address(String cep) {
        this.cep = cep;
        this.number = "";
        this.full = "";
    }
}
