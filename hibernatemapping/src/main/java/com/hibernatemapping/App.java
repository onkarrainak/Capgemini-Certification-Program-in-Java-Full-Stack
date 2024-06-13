package com.hibernatemapping;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = null;
		tr = s.beginTransaction();

//        School stu= new School("Kareem", "Nashik");
//        s.save(stu);
//        School stu1= new School("Sujay", "kolhapur");
//        s.save(stu1);

//        School stu = new School();
//        stu.setId(2);
//        stu.setName("Sourabh");
//        stu.setCity("Pune");
//		s.update(stu);
//		System.out.println("Record Updated SuccessFully");

//		Delete
		School b = new School();
		b.setId(2);
		s.delete(b);

		Query q = s.createQuery("from School");
		List<School> li = q.list();
		for (School bk : li) {
			System.out.println(bk);
		}
		tr.commit();

	}
}