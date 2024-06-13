package onetoonebidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	Question1 que = new Question1();
	que.setQuestion("What is JVM");
	Answer1 ans = new Answer1();
	ans.setAid(104);
	ans.setAnswer("Java virtual machine");
	que.setAns(ans);        // Extra Column Created in A Question Table.
	
//	ans.setQue(que);// new column created in ques table and answer is set.
	s.save(que);                // insert record in table and save it 
	s.persist(ans);                // same as save 
	t.commit();
	s.close();
	sf.close();
	}
}


////que.setA1(ans);
//ans.setQue(que);// new column created in ques table and answer is set.
//s.save(que);                // insert record in table and save it 
//s.persist(ans);                // same as save 
//t.commit();

