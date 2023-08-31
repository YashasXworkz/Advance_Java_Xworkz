package com.xworkz.isro.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.isro.entity.IsroEntity;

public class CRUDOperation {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Query query = manager.createNamedQuery("findAll");
		List<IsroEntity> list = query.getResultList();
		if (list.isEmpty()) {
			System.out.println("results are empty");
		} else {
			System.out.println(list);
			System.out.println(list.size());
		}

		Query query2 = manager.createNamedQuery("findById");
		query2.setParameter("id", 3);
		Object result = query2.getSingleResult();
		System.out.println(result);

		transaction.begin();
		Query query3 = manager.createNamedQuery("updateChairmanByHeadQuarter");
		query3.setParameter("chairman", "Govind");
		query3.setParameter("headquarter", "delhi");
		int row = query3.executeUpdate();
		if (row > 0) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

		Query query4 = manager.createNamedQuery("deleteById");
		query4.setParameter("id", 4);
		int row2 = query4.executeUpdate();
		if (row2 > 0) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
		transaction.commit();
		manager.close();
	}
}
