package com.baseogm.data;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Connection {
    private static EntityManager manager;

    public synchronized static EntityManager getConnection() {
        if(manager == null)
            manager = Persistence.createEntityManagerFactory("teste").createEntityManager();
        return manager;       
    }

    public synchronized static void closeConnection(){
        manager.close();
    }
}