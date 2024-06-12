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
        System.out.println("Product id :: " + Product.getPid());
        System.out.println("Product name :: " + Product.getPname());
        System.out.println("Product Price :: " + Product.getPrice());
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Record Successfully fetch from database");
    }
	
//	public void updateRecordById(int id, String name) {
//        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
//        entityManager.getTransaction().begin();
//        Student student = entityManager.find(Student.class, id);
//        student.setName(name);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        System.out.println("Record updated Successfully into database");
//    }
	
	public void fetchAllRecords() {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        List<Products> ProductsList = new ArrayList<Products>();
        ProductsList = entityManager.createQuery("FROM Products").getResultList();
        if (ProductsList == null) {
            System.out.println("No Record Found");
        } else {
        	System.out.println("****************************");
        	System.out.println(" Product id \t Product name \t Product Price");
            for (Products student : ProductsList) {
                System.out.println("\t" + student.getPid() + "\t" + student.getPname() + "\t  " + student.getPrice());
                
                
            }
        }
        System.out.println("****************************");
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Records Successfully fetch from database");
    }

}
