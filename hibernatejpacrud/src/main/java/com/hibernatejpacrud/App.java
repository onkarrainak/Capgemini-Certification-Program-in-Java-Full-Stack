package com.hibernatejpacrud;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Products p1 = new Products("IPhone 15 plus", "89000");
//        JpaCrud jpacrud1 = new JpaCrud();
//        jpacrud1.insertRecord(p1);
//        
//        Products p2 = new Products("IPhone 15 pro", "129000");
//        JpaCrud jpacrud2 = new JpaCrud();
//        jpacrud2.insertRecord(p2);
//        
//        Products p = new Products("IPhone 15", "79000");
//        JpaCrud jpacrud = new JpaCrud();
//        jpacrud.insertRecord(p);
        
//        JpaCrud jpacCrud = new JpaCrud();
//        jpacCrud.deleteRecordById(8);
//        jpacCrud.findRecordById(2);
        
        JpaCrud allProduct = new JpaCrud();
        allProduct.fetchAllRecords();
        
    }
}
