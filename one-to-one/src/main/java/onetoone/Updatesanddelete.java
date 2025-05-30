package onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Updatesanddelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tr=em.getTransaction();
		StudentsDetailes s=em.find(StudentsDetailes.class, 1);
		s.setDegree(null);
		tr.begin();
		em.persist(s);
		tr.commit();
		System.out.println("data is updated");

	}

}
