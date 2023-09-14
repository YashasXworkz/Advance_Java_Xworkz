package com.xworkz.tourism.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.tourism.dto.TourismDTO;
import com.xworkz.tourism.entity.TourismEntity;

public class TourismRepoImpl implements TourismRepo {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean onSave(TourismDTO dto) {
		System.out.println("Invoked onSave method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		TourismEntity entity = new TourismEntity();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNo(dto.getPhoneNo());
		entity.setPlaces(dto.getPlaces());
		entity.setAadhaarNo(dto.getAadhaarNo());
		entity.setPan(dto.getPan());
		entity.setAge(dto.getAge());
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public Long getCount() {
		EntityManager manager = factory.createEntityManager();
		Long count = (Long) manager.createNamedQuery("countAll").getSingleResult();
		return count;
	}

	@Override
	public List<TourismEntity> getAll() {
		EntityManager manager = factory.createEntityManager();
		List<TourismEntity> entities = manager.createNamedQuery("getAll").getResultList();
		return entities;
	}
}
