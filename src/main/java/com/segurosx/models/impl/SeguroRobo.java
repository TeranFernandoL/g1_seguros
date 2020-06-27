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
/*    
=======
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
}*/