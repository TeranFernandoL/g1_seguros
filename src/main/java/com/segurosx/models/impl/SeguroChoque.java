package com.segurosx.models.impl;

import com.segurosx.models.TipoSeguroVehicular;
import com.segurosx.models.interfaces.IChoque;

public class SeguroChoque extends TipoSeguroVehicular implements IChoque{

    @Override
    public String accion() {
        String c = this.getCoberturaChoque();
        return c;
    }

    @Override
    public String getCoberturaChoque() {
        String  c = "Cobertura choque";
        return c;
    }
    
}