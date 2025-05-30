package onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tr=em.getTransaction();
		 Degree d=new Degree();
		 
		 d.setDegree("MSC");
		 d.setSslcpercentage(65);
		 d.setHsspercentage(95);
		 d.setDegreepercentage(85);
		 
		 StudentsDetailes s=new StudentsDetailes();
		 
		 s.setName("dinesh");
		 s.setEmail("bala@gmail.com");
		 s.setPhone(423456);
		 s.setDegree(d);
		 
		 tr.begin();
		 em.persist(s);
		 em.persist(d);
		 tr.commit();
		 System.out.println("data is saved");
		 

	}

}
