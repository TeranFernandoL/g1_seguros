package com.segurosx.models.impl;

import com.segurosx.models.abstracts.AbstractSeguro;

public class SeguroTarjeta extends AbstractSeguro{
  

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro() {
        
        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }
}