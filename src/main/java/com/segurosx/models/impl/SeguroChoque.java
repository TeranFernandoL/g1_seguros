package com.segurosx.models.impl;

import com.segurosx.models.interfaces.IChoque;
import com.segurosx.models.TipoSeguro;

public class SeguroChoque extends TipoSeguro implements IChoque{

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