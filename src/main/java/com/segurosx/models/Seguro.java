package com.segurosx.models;

import java.util.Random;

import com.segurosx.models.interfaces.*;


public abstract class Seguro implements IDetalleSeguro, IRiesgoSeguro, ICobertura{

    protected String id;
    protected Integer numero;
    protected IDocumento documento;
    protected String nivelRiesgo = "NINGUNO";
    protected String tipo = "NINGUNO";
    protected Double prima;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IDocumento getDocumento() {
        return documento;
    }

    public void setDocumento(IDocumento documento){
        this.documento = documento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void calcularPrima(ICalculoPrima calculoPrima){
        this.prima = calculoPrima.getPrima();
    }

}
