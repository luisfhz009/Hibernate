


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Main {
public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	 
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	SanPost sanpost = new SanPost();
	sanpost.setPstControl("Elemento not null");
	sanpost.setPstContent("Contenido Hibernate");
	session.save(sanpost);
	tr.commit();
	System.out.println("Se guardó satisfactoriamente");
	sessionFactory.close();
}
}
