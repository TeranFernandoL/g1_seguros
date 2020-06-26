package com.segurosx.models.impl;

import com.segurosx.models.Seguro;
import com.segurosx.models.TipoSeguro;

public class SeguroVehicular extends Seguro  {

    
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

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo + " tipo: "+ this.tipo;
    }    

    @Override
    public String getNivelRiesgo() {
         return this.nivelRiesgo;
    }
    //método propio
    public void cobertura(TipoSeguro e){
        this.tipo= e.accion();
    }
}