package com.segurosx.models.impl;

import com.segurosx.models.Seguro;

public class SeguroTarjeta extends Seguro {

    private String bancoTarjeta;

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void calcularRiesgo()   {

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

    @Override
    public String getNivelRiesgo() {
         return this.nivelRiesgo;
    }

    @Override
    public void cobertura(){
        
    }
}