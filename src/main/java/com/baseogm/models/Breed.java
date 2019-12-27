package com.baseogm.models;

import javax.persistence.Entity;

@Entity

public class Breed extends Model{
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    private String name;

    @Override
    public String toString(){
        return "Bred{ \n" +
            "\t _id: " +  this.getId() + "\n" +
            "\t name: " + this.name + "\n" +
        "}";
    }
}