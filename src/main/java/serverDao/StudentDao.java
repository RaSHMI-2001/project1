package serverDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import serverDto.StudentDto;

public class StudentDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void create(StudentDto dl)
	{
		et.begin();
		em.persist(dl);
		et.commit();
		
	}
	public String delete(int dl)
	{
		StudentDto dd=em.find(StudentDto.class, dl);
		if(dd!=null)
		{
		
			et.begin();
			em.remove(dd);
			et.commit();
			return "<h1>Data is deleted</h1>";
		}
		else
		{
			return "<h1>No data found</h1>";
		}
				
	}
	public String update(int id,long phno)
	{
	     StudentDto std=em.find(StudentDto.class,id);
	     std.setPhno(phno);
	     et.begin();
	     em.persist(std);
	     et.commit();
	     return "<h1>Data updated</h1>";
	}
	
	public StudentDto fetchById(int id)
	{
		StudentDto dto=em.find(StudentDto.class,id);
		return dto;
	}

	public  List<StudentDto> fetchAll()
	{
		Query q=em.createQuery("select aaa from StudentDto aaa");
		List<StudentDto> list=q.getResultList();
		return list;
	}
	
	public void delete1(int id)
	{
		StudentDao dao=em.find(StudentDao.class,id);
		et.begin();
		em.remove(id);
		et.commit();
	}
}
