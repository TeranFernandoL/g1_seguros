package com.segurosx.models.impl;

import com.segurosx.models.TipoSeguroVehicular;
import com.segurosx.models.interfaces.IRobo;

public class SeguroRobo extends TipoSeguroVehicular implements IRobo{

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
