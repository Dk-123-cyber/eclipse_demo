package onetoone;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateDegree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tr=em.getTransaction();
		Degree d=em.find(Degree.class, id);
		if(d!=null) {
			
			d.setDegreepercentage(55);
			d.setYop(2020);
			tr.begin();
			em.merge(d);
			tr.commit();
			
			System.out.println("data is updated");
		}
		
		

	}


}
