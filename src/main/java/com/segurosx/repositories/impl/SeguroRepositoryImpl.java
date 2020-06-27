/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segurosx.repositories.impl;
import com.segurosx.models.Seguro;
import com.segurosx.repositories.SeguroRepository;

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
public class SeguroRepositoryImpl implements SeguroRepository{
    private static final String COLLECTION_NAME = "seguros";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

    private final MongoCollection<Seguro> seguros;

    public SeguroRepositoryImpl(MongoDatabase database) {
        this.seguros = database.getCollection(COLLECTION_NAME, Seguro.class);
    }

    @Override
    public void create(Seguro seguro) {
        System.out.println("entrando: " + seguro);
        seguro.setId((new ObjectId()).toString());
        seguros.insertOne(seguro);
    }

    @Override
    public void delete(String id) {
        seguros.deleteOne(new Document("_id", id));
    }

    @Override
    public Seguro find(String id) {
        //System.out.println("_id: " + id);
        return seguros.find(eq("_id", id)).first();
    }

    @Override
    public List<Seguro> findAll() {
        List<Seguro> result = new LinkedList<>();

        for (Seguro seguro : seguros.find()) {
            //System.out.println("customer: " + customer);
            result.add(seguro);
        }

        return result;
    }

    @Override
    public Seguro update(Seguro post, String id) {
        return seguros.findOneAndReplace(new Document("_id", id), post, UPDATE_OPTIONS);
    }
}
