/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segurosx.repositories;
import com.segurosx.models.Seguro;
import java.util.List;
/**
 *
 * @author shinobu
 */
public interface SeguroRepository {
    void create(Seguro seguro);

    Seguro find(String id);

    List<Seguro> findAll();

    Seguro update(Seguro post, String id);

    void delete(String id);
}