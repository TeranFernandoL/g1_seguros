/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segurosx.controllers;
import io.javalin.http.BadRequestResponse;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;
import com.segurosx.config.Paths;
import com.segurosx.models.Seguro;
import com.segurosx.repositories.SeguroRepository;
/**
 *
 * @author shinobu
 */
public class SeguroController {
    private static final String ID = "id";

    private SeguroRepository seguroRepository;

    public SeguroController(SeguroRepository postRepository) {
        this.seguroRepository = postRepository;
    }
    

    public void create(Context context) {
        Seguro seguro = context.bodyAsClass(Seguro.class);
        System.out.println(context.body());
        if (seguro.getId() != null) {
            throw new BadRequestResponse(String.format("Unable to create a new post with existing id: %s", seguro));
        }

        seguroRepository.create(seguro);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(seguro.getId().toString()));

    }

    public void delete(Context context) {
        seguroRepository.delete(context.pathParam(ID));

    }

    public void find(Context context) {
        String id = context.pathParam(ID);
        Seguro seguro = seguroRepository.find(id);

        if (seguro == null) {
            throw new NotFoundResponse(String.format("A customer with id '%s' is not found", id));
        }

        context.json(seguro);

    }

    public void findAll(Context context) {
        context.json(seguroRepository.findAll());
    }

    public void update(Context context) {
        Seguro seguro = context.bodyAsClass(Seguro.class);
        String id = context.pathParam(ID);

        if (seguro.getId() != null && !seguro.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }

        seguroRepository.update(seguro, id);

    }
}
