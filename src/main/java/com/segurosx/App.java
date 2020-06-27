package com.segurosx;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;

import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;
import com.segurosx.config.DBConnectionManager;
import com.segurosx.controllers.SeguroController;
import com.segurosx.controllers.ClienteController;

import com.segurosx.repositories.impl.ClienteRepositoryImpl;
import com.segurosx.repositories.impl.SeguroRepositoryImpl;


import com.segurosx.models.Certificado;
import com.segurosx.models.Cliente;
import com.segurosx.models.Poliza;
import com.segurosx.models.Soat;
import com.segurosx.models.impl.SeguroChoque;
import com.segurosx.models.impl.SeguroTarjeta;
import com.segurosx.models.impl.SeguroVehicular;

public class App 
{
    private final DBConnectionManager manager;
    private final ClienteController clienteController;
    private final SeguroController seguroController;
    public App() {
        this.manager = new DBConnectionManager();
        
        ClienteRepositoryImpl clienteRepositoryImpl = new ClienteRepositoryImpl(this.manager.getDatabase());
        this.clienteController = new ClienteController(clienteRepositoryImpl);
        SeguroRepositoryImpl seguroRepositoryImpl = new SeguroRepositoryImpl(this.manager.getDatabase());
        this.seguroController = new SeguroController(seguroRepositoryImpl);
        
        
    }
    public static void main( String[] args )
    {
        new App().startup();
         Cliente cliente = new Cliente("Juan Perez");
        
        /*SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        cliente.setCompraSeguro(seguro);*/

        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris",new Soat());
        seguro.calcularRiesgo();
        seguro.setDocumento(new Certificado());
        cliente.setCompraSeguro(seguro);

        Poliza poliza = new Poliza();
        SeguroVehicular seguro1 = new SeguroVehicular("Toyota","Yaris",new SeguroChoque());
        seguro1.calcularRiesgo();
        seguro1.setDocumento(poliza);
        cliente.setCompraSeguro(seguro1);

        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.calcularRiesgo();
        cliente.setCompraSeguro(seguro2);

        cliente.getListaSeguroCliente();
   }

   public void startup() {

        Info applicationInfo = new Info()
            .version("1.0")
            .description("Demo API");
        OpenApiOptions openApi = new OpenApiOptions(applicationInfo)
            .path("/api")
            .swagger(new SwaggerOptions("/api-ui")); // endpoint for swagger-ui
        Javalin server = Javalin.create(
            config -> {
                config.registerPlugin(new OpenApiPlugin(openApi));
            }
        ).start(7000);
        
        server.get("api/cliente/:id", this.clienteController::find);
        server.delete("api/cliente/:id", this.clienteController::delete);
        server.get("api/cliente", this.clienteController::findAll);
        server.post("api/cliente", this.clienteController::create);
        
        server.get("api/seguro/:id", this.seguroController::find);
        server.delete("api/seguro/:id", this.seguroController::delete);
        server.get("api/seguro", this.seguroController::findAll);
        server.post("api/seguro", this.seguroController::create);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            this.manager.closeDatabase();
            server.stop();
        }));

    }  
}