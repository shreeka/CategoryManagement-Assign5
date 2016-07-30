/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.categorymanagement.dao;

import com.shreeka.categorymanagement.entity.Category;


/**
 *
 * @author Decode
 */
public interface CategoryDAO {
   
     boolean insert(Category c);
    boolean delete(int id);
    Category getById(int id);
    Category[] getAll();
    
}
