package com.baseogm.controllers;

import javax.persistence.EntityManager;

import com.baseogm.data.Connection;
import com.baseogm.models.Dono;

public class DonoController{
    private EntityManager manager;

    public DonoController() { this.manager = Connection.getConnection(); }

    public void save(Dono dono){
        manager.getTransaction().begin();
        manager.persist(dono);
        manager.getTransaction().commit();
    }
    
}