package Lab_Question_2;
// lab question 2

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainSys { // main class
	public static void main(String[] args) { // main method
	StudentDetails details = new StudentDetails("Mukul Kumar","B-Tech","New Delhi");
	Student_Id si = new Student_Id (1670993);
	details.setSid(si);
	Transaction txn;
	try(Session session=HibernateUtil.getSessionFactory().openSession()){
	txn = session.beginTransaction();
	session.save(details);
	txn.commit();
}
}
}