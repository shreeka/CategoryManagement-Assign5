/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.categorymanagement.impl;

import com.shreeka.categorymanagement.dao.CategoryDAO;
import com.shreeka.categorymanagement.entity.Category;

/**
 *
 * @author Decode
 */
public class CategoryDAOImpl implements CategoryDAO {
    
    private int counter=0;
    private Category[] categoryList=new Category[10];

    @Override
    public boolean insert(Category c) {
        if(counter<categoryList.length)
        {
            categoryList[counter]=c;
            counter++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for(int i=0;i<categoryList.length;i++)
        {
            Category c=categoryList[i];
            if(c!=null && c.getId()==id)
            {
                c=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Category getById(int id) {
        for(int i=0;i<categoryList.length;i++)
        {
            Category c= categoryList[i];
            if(c!=null && c.getId()==id){
            return c;
            }
        }
        return null;  
    }

    @Override
    public Category[] getAll() {
        return categoryList;
    }
    
}
