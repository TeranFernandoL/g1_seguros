package com.segurosx.models;

import com.segurosx.models.interfaces.IFormaPagoDebitoAutomatico;

public class DebidoAutomatico implements IFormaPagoDebitoAutomatico {

    @Override
    public void realizaDescuentoAutomaticoBanco() {
        
        System.out.println("Genera cargo en la cuenta de debito automatico");
    }
    
}