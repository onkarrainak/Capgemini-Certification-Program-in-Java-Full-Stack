package com.hibernatejpacrud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class JpaCrud {
	public void insertRecord(Products p) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(p); // used to insert data into database
        entityManager.getTransaction().commit();
        entityManager.clear();
        System.out.println("Record Successfully inserted in to Database");  
    }
	
	
	public void deleteRecordById(int id) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Products Product = entityManager.find(Products.class, id);
        entityManager.remove(Product);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Record deleted Successfully from database");
    }
	
	
	public void findRecordById(int id) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Products Product = entityManager.find(Products.class, id);
        System.out.println("****************************");
    	System.out.println(" Product id \t Product name \t Product Price");
    	System.out.println("\t" + Product.getPid() + "\t" + Product.getPname() + "\t  " + Product.getPrice());
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Record Successfully fetch from database");
    }
	
	public void updateRecordById(int id, String name,String price) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Products Product = entityManager.find(Products.class, id);
        Product.setPname(name);
        Product.setPrice(price);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Record updated Successfully into database");
    }
	
	public List<Products> fetchAllRecords() {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        List<Products> ProductsList = new ArrayList<Products>();
        ProductsList = entityManager.createQuery("FROM Products").getResultList();
        if (ProductsList == null) {
            System.out.println("No Record Found");
        } else {
        	System.out.println("****************************");
        	System.out.println(" Product id \t  name \t Product Price");
            for (Products product : ProductsList) {
                System.out.println("\t" + product.getPid() + "\t" + product.getPname() + "\t  " + product.getPrice());
                
                
            }
        }
        System.out.println("****************************");
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Records Successfully fetch from database");
		return ProductsList;
    }

}
