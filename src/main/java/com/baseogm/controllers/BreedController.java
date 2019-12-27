package com.baseogm.controllers;

import javax.persistence.EntityManager;

import com.baseogm.data.Connection;
import com.baseogm.models.Breed;

public class BreedController{
    private EntityManager manager;


    public BreedController() { this.manager = Connection.getConnection(); }

    public void save(Breed breed){
        manager.getTransaction().begin();
        manager.persist(breed);
        manager.getTransaction().commit();;
    }
    
}