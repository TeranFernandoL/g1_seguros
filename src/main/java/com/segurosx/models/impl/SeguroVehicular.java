package com.segurosx.models.impl;

import com.segurosx.models.abstracts.AbstractSeguro;

public class SeguroVehicular extends AbstractSeguro {

    
    public SeguroVehicular(String marca, String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }    
}