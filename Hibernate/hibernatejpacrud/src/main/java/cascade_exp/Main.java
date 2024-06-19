package cascade_exp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Mobile m = new Mobile();
		m.setMid(1001);
		m.setMno("9404732100");
//		Mobile m1 = new Mobile();
//		m1.setMid(2);
//		m1.setMno("8149534807");
		Learner l = new Learner();
//		l.setLid(101);
		l.setLname("Sourabh");
		m.setL(l);
	//	m1.setL(l);
		List<Mobile> mlist = new ArrayList<Mobile>();
		mlist.add(m);
	//	mlist.add(m1);
		l.setMlist(mlist);
		entityManager.persist(l);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
