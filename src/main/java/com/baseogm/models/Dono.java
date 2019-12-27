package com.baseogm.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Dono extends Model{
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    private String name;

    @OneToMany
    public List<Dog> getDogs() { return this.dogs; }
    public void setDogs(List<Dog> dogs) {this.dogs = dogs; }
    private List<Dog> dogs;

    @Override
    public String toString(){
        return "Dono{ \n" +
            "\t _id: " +  this.getId() + "\n" +
            "\t name: " + this.name + "\n" +
        "}";
    }
}