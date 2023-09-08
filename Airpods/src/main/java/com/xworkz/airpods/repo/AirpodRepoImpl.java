package main.java.com.xworkz.airpods.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.airpods.dto.AirpodsDto;

public class AirpodRepoImpl implements AirpodsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager em = emf.createEntityManager();

	public boolean store(AirpodsDto dto1) {
		System.out.println("Invoked store method");
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto1);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		return false;
	}

	public boolean updateColorByName(String color, String name) {
		System.out.println("Invoked updateColorByName");
		if (em != null) {
			Query query = em.createNamedQuery("updateColorbyName");
			em.getTransaction().begin();
			query.setParameter("col", color);
			query.setParameter("nm", name);
			int row = query.executeUpdate();
			em.getTransaction().commit();
			return row > 0;
		}
		return false;
	}

	public boolean deleteByPrice(int price) {
		if (em != null) {
			Query query = em.createNamedQuery("deleteByPrice");
			em.getTransaction().begin();
			query.setParameter("pr", price);
			int row = query.executeUpdate();
			em.getTransaction().commit();
			return row > 0;
		}
		return false;
	}

	public List<AirpodsDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll");
		List<AirpodsDto> list = query.getResultList();
		return list;
	}
}
