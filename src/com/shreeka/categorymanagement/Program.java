/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.categorymanagement;

import com.shreeka.categorymanagement.dao.CategoryDAO;
import com.shreeka.categorymanagement.entity.Category;
import com.shreeka.categorymanagement.impl.CategoryDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Decode
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        CategoryDAO categoryDAO=new CategoryDAOImpl();
        while(true)
        {
            System.out.println("");
        System.out.println("1.Add Category");
        System.out.println("2.Delete Category");
        System.out.println("3.Show All");
        System.out.println("4.Search by ID");
        System.out.println("5. Update a category");
        System.out.println("6.Exit");
        System.out.print("Enter your choice [1-5]: ");
        
        switch(input.nextInt())
        {
            case 1:
                Category c=new Category();
                System.out.println("Add new category");
                System.out.print("Enter category Id: ");
                c.setId(input.nextInt());
                System.out.print("Enter category name: ");
                c.setName(input.next());
                System.out.print("Enter category description: ");
                c.setDescription(input.next());
                System.out.print("Enter no. of topics: ");
                c.setDescription(input.next());
                               
                
                if(categoryDAO.insert(c))
                {
                    System.out.println("Inserted successfully");
                }else
                    System.out.println("Data full");
                
                break;
                
            case 2:
                System.out.print("Enter category id to be deleted: ");
                if(categoryDAO.delete(input.nextInt()))
                {
                    System.out.println("Category deleted.");   
                }else
                    System.out.println("Null category id. Cannot be deleted. ");
                break;
                
            case 3:
                System.out.println("Display all categorys");
                Category[] categoryList= categoryDAO.getAll();
                for(int i=0;i<categoryList.length;i++)
                {   if(categoryList[i]!=null)
                {
                    System.out.println("Category id: "+categoryList[i].getId());
                    System.out.println("Category name: "+categoryList[i].getName());
                    System.out.println("Category description: "+categoryList[i].getDescription());
                    System.out.println("Category no. of topics: "+categoryList[i].getNoOfTopics());
                    System.out.println("");
                }
                }
                break;
                
            case 4:
                System.out.print("Enter category id to be searched: ");
                Category category= categoryDAO.getById(input.nextInt());
                if(category!=null){
                System.out.println("Category id: "+category.getId());
                System.out.println("Category name: "+category.getName());
                System.out.println("Category description: "+category.getDescription());
                System.out.println("Category no. of topics: "+category.getNoOfTopics());
                }else
                    System.out.println("Category could not be found.");
                break;
                
            case 5:
                System.out.print("Enter category id to be updated: ");
                int id=input.nextInt();
                Category cupdate=categoryDAO.getById(id);
                if(cupdate!=null){

                System.out.println("1. Update category id");
                System.out.println("2. Update category name");
                System.out.println("3. Update category description");
                    System.out.println("4.Update no. of topics");
                System.out.print("Enter your choice: ");
                switch(input.nextInt())
                {
                    case 1:
                        System.out.print("Enter new category id: ");
                        cupdate.setId(input.nextInt());
                        break;
                    case 2:
                        System.out.print("Enter new category name: ");
                        cupdate.setName(input.next());
                        break;
                    case 3:
                        System.out.print("Enter new category description: ");
                        cupdate.setDescription(input.next());
                        break;
                    case 4:
                        System.out.print("Enter new no. of topics: ");
                        cupdate.setNoOfTopics(input.nextInt());
                        break;
                }
                    System.out.println("Updated successfully");
                }else
                System.out.println("Category could not be found.");
                break;
                
            case 6:
                System.out.print("Do you really want to exit?(y/n)");
                if((input.next()).equalsIgnoreCase("y")){
                System.exit(0);
                }
                break;
                    
        }
        }
    }
   
    
}
