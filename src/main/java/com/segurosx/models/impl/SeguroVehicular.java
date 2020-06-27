package com.segurosx.models.impl;

import com.segurosx.models.Seguro;
import com.segurosx.models.TipoSeguroVehicular;

public class SeguroVehicular extends Seguro {

    private String marca;
    private String modelo;
    private TipoSeguroVehicular tipoSeguro;

    public SeguroVehicular(String marca, String modelo, TipoSeguroVehicular tipoSeguro)    {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.tipoSeguro = tipoSeguro;
        cobertura();
    }

    @Override
    public void calcularRiesgo(){

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro(){
        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo + " tipo: "+ this.tipo+ " "+this.documento;
    }    

    @Override
    public String getNivelRiesgo() {
         return this.nivelRiesgo;
    }
    
    @Override
    public void cobertura(){
        this.tipo = tipoSeguro.accion();
    }

}