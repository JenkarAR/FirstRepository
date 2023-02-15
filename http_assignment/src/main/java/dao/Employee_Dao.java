package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Employee;

public class Employee_Dao {
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
EntityManager entityManager = entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction = entityManager.getTransaction();

/*public void insert(Employee employee){
entityTransaction.begin();
entityManager.persist(employee);
entityTransaction.commit();
}*/
public void Update(int empid,String empname)
{
	Employee e = entityManager.find(Employee.class, empid);
	e.setEmpname(empname);
	entityTransaction.begin();
	entityManager.merge(e);
	entityTransaction.commit();
}
public void remove(int id)
{
	Employee e = entityManager.find(Employee.class,id);
	if(e!=null)
	{
		entityTransaction.begin();
		entityManager.remove(e);
		entityTransaction.commit();
	}
}
}
