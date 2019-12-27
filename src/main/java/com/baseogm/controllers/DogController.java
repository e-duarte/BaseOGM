package com.baseogm.controllers;

import javax.persistence.EntityManager;

import com.baseogm.data.Connection;
import com.baseogm.models.Dog;

public class DogController{
    private EntityManager manager;


    public DogController() { this.manager = Connection.getConnection(); }

    public void save(Dog dog){
        manager.getTransaction().begin();
        manager.persist(dog);
        manager.getTransaction().commit();
    }
}