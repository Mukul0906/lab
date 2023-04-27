package Lab_Question_1;
 // Lab Question 1

import org.hibernate.Session;
import org.hibernate.Transaction;


public class MainTheater {
	public static void main(String[] args) {
		Theater m1 = new Theater(1,"RRR");
		Theater m2 = new Theater(2,"AAVTAR 2");
		Theater m3 = new Theater(3,"THE ARK");
		Theater m4 = new Theater(4,"Alita");
		Theater m5 = new Theater(4,"EVIL DEAD RISE");
		Transaction txn;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
		txn = session.beginTransaction();
		session.save(m1);
		session.save(m2);
		session.save(m3);
		session.save(m4);
		session.save(m5);
		txn.commit();			
	}
}
}