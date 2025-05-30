package onetoone;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class fetchallStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		jakarta.persistence.Query q=em.createQuery("select s from StudentsDetailes s");
		List<StudentsDetailes>list=q.getResultList();
		for(StudentsDetailes s:list) {
			System.out.println(s);
		}
		

	}

}
