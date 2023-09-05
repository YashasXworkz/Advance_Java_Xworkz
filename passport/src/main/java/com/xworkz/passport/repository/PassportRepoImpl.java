package com.xworkz.passport.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.entity.PassportEntity;

public class PassportRepoImpl implements PassportRepo {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean onSave(PassportDTO dto) {
		System.out.println("Invoked onSave method");
		EntityManager manager = factory.createEntityManager();
		PassportEntity entity = new PassportEntity();
		entity.setName(dto.getName());
		entity.setDob(dto.getDob());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNo(dto.getPhoneNumber());
		entity.setPassword(dto.getPassword());
		entity.setConfirmPassword(dto.getConfirmPassword());
		entity.setPassportOffice(dto.getPassportOffice());
		entity.setAadhaarNo(dto.getAadhaarNo());

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public boolean onUpdate(String existingEmail, String newOffice) {
		System.out.println("Invoked onUpdate method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Query query = manager.createNamedQuery("updateByEmail");
		query.setParameter("email", existingEmail);
		List<PassportEntity> list = query.getResultList();
		System.out.println(list);
		transaction.begin();

		if (!list.isEmpty()) {
			for (PassportEntity pe : list) {
				PassportEntity entity = manager.find(PassportEntity.class, pe.getId());
				entity.setPassportOffice(newOffice);
				manager.merge(entity);
			}
			transaction.commit();
			System.out.println("Entity updated successfully");
			manager.close();
			return true;
		} else {
			System.out.println("No entities found for the provided email");
			return false;
		}
	}

	@Override
	public boolean onSearch(int id) {
		System.out.println("Invoked onSearch method");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findById");
		query.setParameter("id", id);
		Object result = query.getSingleResult();
		if (result != null) {
			System.out.println("Entity found: " + result);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<PassportEntity> getAll() {
		System.out.println("Invoked getAll method");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAll");
		List<PassportEntity> list = query.getResultList();
		return list;
	}

	@Override
	public List<PassportEntity> searchByEmail(String existingEmail) {
		System.out.println("Invoked searchByEmail method");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("email", existingEmail);
		List<PassportEntity> list = query.getResultList();
		return list;
	}

	@Override
	public PassportEntity searchByPhone(Long existingPhone) {
		System.out.println("Invoked searchByPhone method");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByPhone");
		query.setParameter("phNo", existingPhone);
		PassportEntity entity = (PassportEntity) query.getSingleResult();
		return entity;
	}

	@Override
	public Long getCount() {
		System.out.println("Invoked getCount method");
		EntityManager manager = factory.createEntityManager();
		Long counted = (Long) manager.createNamedQuery("countAll").getSingleResult();
		return counted;
	}
}
