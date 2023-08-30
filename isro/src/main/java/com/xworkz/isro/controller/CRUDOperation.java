package com.xworkz.isro.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CRUDOperation {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Query query = manager.createNamedQuery("findAll");
		List list = query.getResultList();
		System.out.println(list);
		System.out.println(list.size());
		Query query2 = manager.createNamedQuery("findById");
		Object object = query2.getSingleResult();
		System.out.println(object);

		transaction.begin();
		Query query3 = manager.createNamedQuery("updateChairmanByHeadQuarter");
		int row = query3.executeUpdate();
		if (row > 0) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

		Query query4 = manager.createNamedQuery("deleteById");
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
