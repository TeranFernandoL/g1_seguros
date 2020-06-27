package com.segurosx;

import com.segurosx.models.Cliente;
import com.segurosx.models.Soat;
import com.segurosx.models.impl.SeguroChoque;
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
        
        /*SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        cliente.setCompraSeguro(seguro);*/

        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris",new Soat());
        seguro.cacularRiesgo();//seguro.cobertura();
        //seguro.setTipoSeguro();
        cliente.setCompraSeguro(seguro);

        SeguroVehicular seguro1 = new SeguroVehicular("Toyota","Yaris",new SeguroChoque());
        seguro1.cacularRiesgo();
        //seguro1.setTipoSeguro(new SeguroChoque());
        cliente.setCompraSeguro(seguro1);

        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.cacularRiesgo();
        cliente.setCompraSeguro(seguro2);

        cliente.getListaSeguroCliente();
   }
}
