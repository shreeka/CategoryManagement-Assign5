/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.categorymanagement.entity;

/**
 *
 * @author Decode
 */
public class Category {
    
    private int id;
    private String name,description;
    private int noOfTopics;

    public Category() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

   

    public int getNoOfTopics() {
        return noOfTopics;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

  

    public void setNoOfTopics(int noOfTopics) {
        this.noOfTopics = noOfTopics;
    }
    
    

    
    
}
