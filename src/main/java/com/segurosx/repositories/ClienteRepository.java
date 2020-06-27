/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segurosx.repositories;
import com.segurosx.models.Cliente;
import java.util.List;
/**
 *
 * @author shinobu
 */
public interface ClienteRepository {
    void create(Cliente cliente);

    Cliente find(String id);

    List<Cliente> findAll();

    Cliente update(Cliente post, String id);

    void delete(String id);
}
