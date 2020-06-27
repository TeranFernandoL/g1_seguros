package com.segurosx.models;

import com.segurosx.models.interfaces.IDocumento;
public class Poliza implements IDocumento{

    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}