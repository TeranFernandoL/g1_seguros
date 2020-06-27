/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segurosx.config;

/**
 *
 * @author shinobu
 */
public class Paths {
    public static final String INDEX = "/";
    public static final String SEGUROS = "/seguros";
    public static final String CLIENTES = "/clientes";
    public static final String ID_PARAM = ":id";

    public static String formatPostLocation(String id) {
        return String.format("%s/%s", CLIENTES, id);
    }
    public static String formatClienteLocation(String id){
        return String.format("%s/%s", SEGUROS, id);
    }
}
