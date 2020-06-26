package com.segurosx.models;

import java.util.Random;
import com.segurosx.models.interfaces.*;

public abstract class Seguro implements IDetalleSeguro, IRiesgoSeguro{

    protected Integer numero;
    protected Certificado certificado;
    protected Poliza poliza;
    protected String nivelRiesgo = "NINGUNO";
    protected String bancoTarjeta;
    protected String marca;
    protected String modelo;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }
    
    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}
