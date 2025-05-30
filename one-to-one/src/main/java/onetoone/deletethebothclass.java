package onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class deletethebothclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tr=em.getTransaction();
		
		StudentsDetailes s=em.find(StudentsDetailes.class, 2);
		Degree d=s.getDegree();

		tr.begin();
		em.remove(d);
		em.remove(s);
		tr.commit();
		System.out.println("data is deleted");
		
		
	}

}
