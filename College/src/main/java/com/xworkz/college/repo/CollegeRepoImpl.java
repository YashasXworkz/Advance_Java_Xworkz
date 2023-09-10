package com.xworkz.college.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepoImpl implements CollegeRepo {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
	private EntityManager em = emf.createEntityManager();

	@Override
	public String save(CollegeDto dto) {
		System.out.println("save method from Repo");
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
		}
		return "data saved successfully";
	}

	@Override
	public List<CollegeDto> readAll() {
		System.out.println("Invoked readAll method");
		Query query = em.createNamedQuery("readAll");
		List<CollegeDto> data = query.getResultList();
		return data;
	}
}
