package com.xworkz.sc.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CRUDOper {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Query query = manager.createNamedQuery("findByFamousPlace");

		List list = query.getResultList();
		System.out.println("-----------------------------------");
		System.out.println(list);

		transaction.begin();
		Query query2 = manager.createNamedQuery("deleteById");
		int row = query2.executeUpdate();
		if (row > 0) {
			System.out.println("Deleted");
		} else {
			System.out.println("Something went wrong");
		}
		transaction.commit();
		manager.close();
	}
}
