package com.segurosx.models.impl;

import com.segurosx.models.interfaces.IRobo;
import com.segurosx.models.TipoSeguro;

public class SeguroRobo extends TipoSeguro implements IRobo{

    @Override
    public String accion() {
        String c = this.getCoberturaRobo();
        return c;
    }

    @Override
    public String getCoberturaRobo() {
        String  c = "Cobertura robo";
        return c;

    }
    
}