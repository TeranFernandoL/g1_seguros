package com.segurosx;

import com.segurosx.models.Cliente;
import com.segurosx.models.impl.SeguroTarjeta;
import com.segurosx.models.impl.SeguroVehicular;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Cliente cliente = new Cliente("Juan Perez");

        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.calcularRiesgo();
        cliente.setCompraSeguro(seguro);


        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.calcularRiesgo();
        cliente.setCompraSeguro(seguro2);

        cliente.getListaSeguroCliente();

   }
}
