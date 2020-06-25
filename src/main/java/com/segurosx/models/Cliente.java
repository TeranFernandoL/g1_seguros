package com.segurosx.models;
import com.segurosx.models.abstracts.AbstractSeguro;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nombre;
    private List<AbstractSeguro> seguros;

    public Cliente(String nombre)   {

        this.nombre = nombre;
        this.seguros = new ArrayList<AbstractSeguro>();
    }

    public void setCompraSeguro(AbstractSeguro seguro) {

        this.seguros.add( seguro );
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre );
        for (AbstractSeguro seguro : seguros )  {

            System.out.println( "Seguro: "+ seguro.getDetalleSeguro() );
        }
        
    }
}