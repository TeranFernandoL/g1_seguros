package com.segurosx.models;

import java.util.Random;
import com.segurosx.models.interfaces.*;

public abstract class Seguro implements IDetalleSeguro,IRiesgoSeguro,ICobertura{

    protected Integer numero;
    protected IDocumento documento;
    protected String nivelRiesgo = "NINGUNO";
    protected String bancoTarjeta;
    protected String marca;
    protected String modelo;
    protected String tipo = "ninguno";
    protected TipoSeguro tipoSeguro;
    
    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }
    
    public void setTipoSeguro(TipoSeguro tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public TipoSeguro getTipoSeguro() {
        return tipoSeguro;
    }

    public IDocumento getDocumento() {
        return documento;
    }
    public void setDocumento(IDocumento documento){
        this.documento = documento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}
