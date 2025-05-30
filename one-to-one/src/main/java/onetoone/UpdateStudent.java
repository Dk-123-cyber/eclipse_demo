package onetoone;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tr=em.getTransaction();
		StudentsDetailes s=em.find(StudentsDetailes.class, id);
		if(s!=null) {
			
			s.setName("mani");
			s.setEmail("mani@gmail.com");
			tr.begin();
			em.merge(s);
			tr.commit();
			System.out.println("data is updated");
		}
		
		

	}

}
