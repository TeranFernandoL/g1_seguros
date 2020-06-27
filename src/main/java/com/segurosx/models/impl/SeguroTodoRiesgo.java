package com.segurosx.models.impl;

import com.segurosx.models.TipoSeguroVehicular;
import com.segurosx.models.interfaces.ITodoRiesgo;

public class SeguroTodoRiesgo extends TipoSeguroVehicular implements ITodoRiesgo{

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