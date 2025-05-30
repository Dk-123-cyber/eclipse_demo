package onetoone;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchDegree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		jakarta.persistence.Query q=em.createQuery("select s from Degree s");
		List<Degree>list=q.getResultList();
		for(Degree d:list) {
			System.out.println(d);
		}
		

	}


}
