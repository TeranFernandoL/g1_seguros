package com.segurosx.models.impl;
import com.segurosx.models.Seguro;
import com.segurosx.models.TipoSeguro;
import com.segurosx.models.interfaces.*;

public class SeguroVehicular extends Seguro{

    public SeguroVehicular(String marca, String modelo)    {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void calcularRiesgo()   {

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

    @Override
    public String getNivelRiesgo() {
         return this.nivelRiesgo;
    }
    
}