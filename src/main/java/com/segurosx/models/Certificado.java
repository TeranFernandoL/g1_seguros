package com.segurosx.models;

import java.util.Random;

import com.segurosx.models.interfaces.IDocumento;

public class Certificado implements IDocumento {
    
    private Integer numero;

    public Certificado(){
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
        return "Numero de certificado: "+this.numero;
    }
}