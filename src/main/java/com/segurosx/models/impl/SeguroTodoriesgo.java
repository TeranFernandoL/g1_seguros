package com.segurosx.models.impl;

import com.segurosx.models.interfaces.ITodoRiesgo;
import com.segurosx.models.TipoSeguro;

public class SeguroTodoriesgo extends TipoSeguro implements ITodoRiesgo{

    @Override
    public String accion() {
        return "Cobertura todo riesgo";

    }

    @Override
    public String getCoberturaRobo() {
        String  c = "Cobertura robo";
        return c;
    }

    @Override
    public String getCoberturaChoque() {
        String  c = "Cobertura choque";
        return c;

    }
    
}