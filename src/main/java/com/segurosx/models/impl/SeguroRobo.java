package com.segurosx.models.impl;

import com.segurosx.models.TipoSeguro;
import com.segurosx.models.interfaces.ISeguroRobo;

public class SeguroRobo extends TipoSeguro implements ISeguroRobo{

    @Override
    public void getTipoCobertura(){
       System.out.println("Seguro de robo");
    }
    
    @Override
    public void prestamoAuto(){
        System.out.println("Se le prestará un auto");
    }

}