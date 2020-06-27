package com.segurosx.models;

import java.util.Random;

import com.segurosx.models.interfaces.IDocumento;
public class Poliza implements IDocumento{

    private Integer numero;

    public Poliza(){
        this.numero = new Integer(new Random().nextInt());
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Número de poliza: " +this.numero;
    }
}