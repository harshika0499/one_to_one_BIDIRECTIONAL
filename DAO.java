package mappingonetone_DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mappingonetoone_DTO.Pancard;
import mappingonetoone_DTO.Person;

public class DAO
{
	public void insertvalue() 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Person person = new Person();
		person.setId(1);
		person.setName("Anupama");

		Pancard pan =new Pancard();
		pan.setId(1);
		pan.setAddress("PUNE");
		pan.setName("anupama");


		et.begin();
		em.persist(pan);
		et.commit();

		System.out.println("data saved ");

	}
	public void getvalue() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Bidirectional");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person  p=entityManager.find(Person.class,1);
		System.out.println(p);
	}
	
	
	public void deletevalue()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		    et.begin();
			Person person =	em.find(Person.class,1);
			em.persist(person);
			et.commit();
		}
	
	
	public void updatevalue() {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bidirectional");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Person person =	em.find(Person.class, 1);
		person.setName("saurabhgambhire");
		person.setId(2);
		em.merge(person);
		et.commit();
	}
	
}
