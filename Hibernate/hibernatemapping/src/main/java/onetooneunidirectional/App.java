package onetooneunidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	Question que = new Question();
	que.setQuestion("What is JDK in java");
	Answer ans = new Answer();
	ans.setAid(101);
	ans.setAnswer("Java Development Kit");
	que.setAns(ans);        // Extra Column Created in A Question Table.
	s.save(que);
	s.save(ans);
	t.commit();
	s.close();
	sf.close();
	}
}


