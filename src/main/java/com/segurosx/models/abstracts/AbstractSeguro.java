/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segurosx.models.abstracts;

import com.segurosx.models.Seguro;

/**
 *
 * @author shinobu
 */
public abstract class AbstractSeguro extends Seguro  {
    protected String marca;
    protected String modelo;
    public abstract String getDetalleSeguro();
    public abstract void cacularRiesgo();
}
