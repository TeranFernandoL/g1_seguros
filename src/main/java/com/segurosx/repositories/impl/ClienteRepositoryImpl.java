/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segurosx.repositories.impl;
import com.segurosx.models.Cliente;
import com.segurosx.repositories.ClienteRepository;

import java.util.List;
import java.util.LinkedList;

//import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import org.bson.types.ObjectId;
/**
 *
 * @author shinobu
 */
public class ClienteRepositoryImpl implements ClienteRepository{
    private static final String COLLECTION_NAME = "clientes";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

    private final MongoCollection<Cliente> clientes;

    public ClienteRepositoryImpl(MongoDatabase database) {
        this.clientes = database.getCollection(COLLECTION_NAME, Cliente.class);
    }

    @Override
    public void create(Cliente cliente) {
        System.out.println("entrando: " + cliente);
        cliente.setId((new ObjectId()).toString());
        clientes.insertOne(cliente);
    }

    @Override
    public void delete(String id) {
        clientes.deleteOne(new Document("_id", id));
    }

    @Override
    public Cliente find(String id) {
        //System.out.println("_id: " + id);
        return clientes.find(eq("_id", id)).first();
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> result = new LinkedList<>();

        for (Cliente cliente : clientes.find()) {
            //System.out.println("customer: " + customer);
            result.add(cliente);
        }

        return result;
    }

    @Override
    public Cliente update(Cliente post, String id) {
        return clientes.findOneAndReplace(new Document("_id", id), post, UPDATE_OPTIONS);
    }
}
