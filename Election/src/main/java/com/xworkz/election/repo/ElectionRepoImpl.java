package com.xworkz.election.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.election.dto.ElectionDto;

public class ElectionRepoImpl {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager em = emf.createEntityManager();

	public boolean save(ElectionDto dto) {
		System.out.println("Invoked save repo method");
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public List<ElectionDto> readAll() {
		System.out.println("Invoked readAll repo method");
		List<ElectionDto> list = em.createNamedQuery("readAll").getResultList();
		return list;
	}
}
