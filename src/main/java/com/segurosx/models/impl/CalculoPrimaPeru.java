package com.segurosx.models.impl;

import com.segurosx.models.Certificado;
import com.segurosx.models.interfaces.ICalculoPrima;

import java.util.ArrayList;

public class CalculoPrimaPeru implements ICalculoPrima {

    private ArrayList<Certificado> certificados;

    public CalculoPrimaPeru(ArrayList<Certificado> certificados) {
        this.certificados = certificados;
    }

    @Override
    public Double getPrima(){
        return 1.0;
    }

    @Override
    public Double distribucionMensualidadPrima(){
        return getPrima()/12;
    }
}
